import java.util.*;

/**
 * Class Sale represents how a sale occurs
 */
public class Sale {

	/**
	 * Stores the current date that a sale occurs on
	 */
	private LocalDateTime dateTime;
	/**
	 * Boolean that stores whether an item is tax free or not
	 */
	private Boolean taxFree;
	/**
	 * object of SaleLine class that stores saleline item information
	 */
	private Collection<SaleLineItem> saleLineItems;
	/**
	 * object of Payment class that stores payment details of item un sale class
	 */
	private Collection<Payment> payments;

	/**
	 * Default constructor
	 */
	public Sale() {
		// TODO - implement Sale.Sale
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor that takes taxFree as a parameter
	 * @param taxFree
	 */
	public Sale(String taxFree) {
		// TODO - implement Sale.Sale
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes payment object as parameter and adds it to sale accordingly
	 * @param payment
	 */
	public void addPayment(Payment payment) {
		// TODO - implement Sale.addPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes payment object as a parameter and deletes it accordingly
	 * @param payment
	 */
	public void removePayment(Payment payment) {
		// TODO - implement Sale.removePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes object of sale line item and adds it accordingly
	 * @param sli
	 */
	public void addSaleLineItem(SaleLineItem sli) {
		// TODO - implement Sale.addSaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * method that  calculates total and returns amount as bigDecimal
	 */
	public BigDecimal calcTotal() {
		// TODO - implement Sale.calcTotal
		throw new UnsupportedOperationException();
	}

	/**
	 * method that calculates subTotal and will return amount as bigDecimal
	 */
	public BigDecimal calcSubTotal() {
		// TODO - implement Sale.calcSubTotal
		throw new UnsupportedOperationException();
	}

	/**
	 * method that calculates tax on an item and returns as bigdecimal
	 */
	public BigDecimal calcTax() {
		// TODO - implement Sale.calcTax
		throw new UnsupportedOperationException();
	}

	/**
	 * method that returns totalpayment as bigdecimal
	 */
	public BigDecimal getTotalPayment() {
		// TODO - implement Sale.getTotalPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * method that returns true or false after checking whether a payment is enough or not
	 */
	public Boolean isPaymentEnough() {
		// TODO - implement Sale.isPaymentEnough
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes an amount tendered by customer and then calculates how much the store is going to keep. Returns amount as big decimal
	 * @param amtTendered
	 */
	public BigDecimal calcAmountForPayment(BigDecimal amtTendered) {
		// TODO - implement Sale.calcAmountForPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * method that calculates change and returns amount as big decimal
	 */
	public BigDecimal calcChange() {
		// TODO - implement Sale.calcChange
		throw new UnsupportedOperationException();
	}

	/**
	 * method that returns the total amount given by customer. returns amount as big decimal
	 */
	public BigDecimal calcAmtTendered() {
		// TODO - implement Sale.calcAmtTendered
		throw new UnsupportedOperationException();
	}

	/**
	 * returns a string representation for the class Sale
	 */
	public String toString() {
		// TODO - implement Sale.toString
		throw new UnsupportedOperationException();
	}

}