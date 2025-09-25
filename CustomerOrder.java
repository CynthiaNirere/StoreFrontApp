import java.util.*;

public class CustomerOrder {

	Shipping shippingOrder;
	Customer customerOrder;
	Collection<orderLineItem> orderItem;
	private String orderNumber;
	private int qtyOrdered;
	private int qtyDelivered;
	private Payment payments;

	public CustomerOrder() {
		// TODO - implement CustomerOrder.CustomerOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qtyOrdered
	 */
	public CustomerOrder(int qtyOrdered) {
		// TODO - implement CustomerOrder.CustomerOrder
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement CustomerOrder.toString
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTotal() {
		// TODO - implement CustomerOrder.calcTotal
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTax() {
		// TODO - implement CustomerOrder.calcTax
		throw new UnsupportedOperationException();
	}

	public Boolean isPaymentEnough() {
		// TODO - implement CustomerOrder.isPaymentEnough
		throw new UnsupportedOperationException();
	}

}