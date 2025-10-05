import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Unit tests for StoreFront application business logic
 * Tests include: Mock for PaymentService, Stub for ShippingService, and real object tests
 */
public class storeFrontTest {
    
    @Mock
    private PaymentService mockPaymentService;
    
    @Mock
    private EmailService mockEmailService;
    
    private ShippingService stubShippingService;
    private OrderProcessor orderProcessor;
    private PricingCalculator pricingCalculator;
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        stubShippingService = new ShippingServiceStub();
        pricingCalculator = new PricingCalculator();
    }
    
    /**
     * TEST 1: Using a MOCK
     * Test that payment processing validates the amount 
     * and sends confirmation email when payment is successful
     */
    @Test
    public void testPaymentProcessingWithEmailNotification_UsesMock() {
        // Arrange
        Customer customer = new Customer("Cynthia", "cynthia@email.com");
        Order order = new Order(customer, 150.00);
        
        // Configure mock to return successful payment
        when(mockPaymentService.processPayment(order, "credit_card"))
            .thenReturn(true);
        
        orderProcessor = new OrderProcessor(mockPaymentService, mockEmailService);
        
        // Act
        boolean result = orderProcessor.processOrder(order, "credit_card");
        
        // Assert
        assertTrue(result, "Order should be processed successfully");
        
        // Verify mock was called with correct parameters
        verify(mockPaymentService, times(1))
            .processPayment(order, "credit_card");
        
        // Verify email notification was sent
        verify(mockEmailService, times(1))
            .sendOrderConfirmation(customer.getEmail(), order.getOrderId());
        
        System.out.println("✓ TEST 1 PASSED: Payment processing with email notification (MOCK)");
    }
    
    /**
     * TEST 2: Using a STUB
     * Test that shipping fee is waived for orders over $100
     * Requirement: "The system shall waive shipping fees for orders over $100"
     */
    @Test
    public void testShippingFeeWaivedForOrdersOver100_UsesStub() {
        // Arrange
        Order smallOrder = new Order(new Customer("John", "john@email.com"), 75.00);
        Order largeOrder = new Order(new Customer("Sarah", "sarah@email.com"), 150.00);
        
        // Act
        double smallOrderShipping = stubShippingService.calculateShippingFee(smallOrder);
        double largeOrderShipping = stubShippingService.calculateShippingFee(largeOrder);
        
        // Assert
        assertTrue(smallOrderShipping > 0, 
            "Orders under $100 should have shipping fees");
        assertEquals(0.0, largeOrderShipping, 0.01, 
            "Orders over $100 should have NO shipping fees (waived)");
        
        System.out.println("✓ TEST 2 PASSED: Shipping fee waiver logic (STUB)");
    }
    
    /**
     * TEST 3: Real Object Test
     * Test discount calculation based on shopping history
     * Requirement: "The system shall display personalized deals based on shopping history"
     */
    @Test
    public void testPersonalizedDiscountCalculation() {
        // Arrange
        Customer regularCustomer = new Customer("Alice", "alice@email.com");
        regularCustomer.setPurchaseHistory(250.00); // $250 total purchases
        
        Customer vipCustomer = new Customer("Bob", "bob@email.com");
        vipCustomer.setPurchaseHistory(1500.00); // $1500 total purchases
        
        double orderAmount = 100.00;
        
        // Act
        double regularDiscount = pricingCalculator.calculatePersonalizedDiscount(
            regularCustomer, orderAmount);
        double vipDiscount = pricingCalculator.calculatePersonalizedDiscount(
            vipCustomer, orderAmount);
        
        // Assert
        assertTrue(regularDiscount >= 0 && regularDiscount <= 5.00,
            "Regular customers should get 0-5% discount");
        assertTrue(vipDiscount >= 10.00 && vipDiscount <= 15.00,
            "VIP customers (>$1000 history) should get 10-15% discount");
        assertTrue(vipDiscount > regularDiscount,
            "VIP customers should get better discounts than regular customers");
        
        System.out.println("✓ TEST 3 PASSED: Personalized discount calculation");
    }
    
    /**
     * TEST 4: Edge Case Test
     * Test payment method validation
     * Requirement: "The system shall allow customers to make payments using 
     * a credit card, PayPal, or cash (in-store)"
     */
    @Test
    public void testPaymentMethodValidation() {
        // Arrange
        String[] validMethods = {"credit_card", "paypal", "cash"};
        String invalidMethod = "bitcoin";
        
        // Act & Assert
        for (String method : validMethods) {
            assertTrue(PaymentValidator.isValidPaymentMethod(method),
                method + " should be a valid payment method");
        }
        
        assertFalse(PaymentValidator.isValidPaymentMethod(invalidMethod),
            "Invalid payment methods should be rejected");
        
        System.out.println("✓ TEST 4 PASSED: Payment method validation");
    }
}
/**
 * Stub implementation for ShippingService
 * Returns fixed/predictable values for testing
 */
class ShippingServiceStub extends ShippingService {
    @Override
    public double calculateShippingFee(Order order) {
        // Business rule: Free shipping for orders over $100
        if (order.getTotalAmount() > 100.00) {
            return 0.0;
        }
        return 10.00; // Standard shipping fee
    }
}

/**
 * Real implementation of PricingCalculator
 */
class PricingCalculator {
    public double calculatePersonalizedDiscount(Customer customer, double orderAmount) {
        double purchaseHistory = customer.getPurchaseHistory();
        
        if (purchaseHistory > 1000.00) {
            // VIP customer: 10-15% discount
            return orderAmount * 0.10;
        } else if (purchaseHistory > 500.00) {
            // Regular customer: 5% discount
            return orderAmount * 0.05;
        } else {
            // New customer: 0% discount
            return 0.0;
        }
    }
}

/**
 * Payment validator utility
 */
class PaymentValidator {
    private static final String[] VALID_METHODS = {"credit_card", "paypal", "cash"};
    
    public static boolean isValidPaymentMethod(String method) {
        for (String valid : VALID_METHODS) {
            if (valid.equalsIgnoreCase(method)) {
                return true;
            }
        }
        return false;
    }
}

class Customer {
    private String name;
    private String email;
    private double purchaseHistory;
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = 0.0;
    }
    
    public String getEmail() { return email; }
    public double getPurchaseHistory() { return purchaseHistory; }
    public void setPurchaseHistory(double amount) { this.purchaseHistory = amount; }
}

class Order {
    private static int orderCounter = 1000;
    private int orderId;
    private Customer customer;
    private double totalAmount;
    
    public Order(Customer customer, double totalAmount) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }
    
    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public double getTotalAmount() { return totalAmount; }
}

interface PaymentService {
    boolean processPayment(Order order, String paymentMethod);
}

interface EmailService {
    void sendOrderConfirmation(String email, int orderId);
}

class ShippingService {
    public double calculateShippingFee(Order order) {
        // Base implementation
        return 10.00;
    }
}

class OrderProcessor {
    private PaymentService paymentService;
    private EmailService emailService;
    
    public OrderProcessor(PaymentService paymentService, EmailService emailService) {
        this.paymentService = paymentService;
        this.emailService = emailService;
    }
    
    public boolean processOrder(Order order, String paymentMethod) {
        boolean paymentSuccess = paymentService.processPayment(order, paymentMethod);
        
        if (paymentSuccess) {
            emailService.sendOrderConfirmation(
                order.getCustomer().getEmail(), 
                order.getOrderId()
            );
            return true;
        }
        return false;
    }
}