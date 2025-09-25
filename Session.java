import java.util.*;

/**
 * Class session that handles how a session at store will occur
 */
public class Session {

	/**
	 * stores that starting time of a session
	 */
	private LocalDateTime startDateTime;
	/**
	 * stores the ending time of a session
	 */
	private LocalDateTime endDateTime;
	/**
	 * object of cashier that access methods of class Cashier.
	 * stores cashier in that session
	 */
	private Cashier cashier;
	/**
	 * object of sale that will have access to methods in sale class
	 * stores sales that occur in session
	 */
	private Collection<Sale> sales;
	/**
	 * object of register that will have access methods of register
	 * stores registers used in a session
	 */
	private Register register;

	/**
	 * default constructor
	 */
	public Session() {
		// TODO - implement Session.Session
		throw new UnsupportedOperationException();
	}

	/**
	 * constructor that takes cashier object and register object as parameter
	 * @param cashier
	 * @param register
	 */
	public Session(Cashier cashier, Register register) {
		// TODO - implement Session.Session
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes object of sale as parameter
	 * adds the sale accordingly
	 * @param sale
	 */
	public void addSale(Sale sale) {
		// TODO - implement Session.addSale
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes object of sale as parameter
	 * removes the sale accordingly
	 * @param sale
	 */
	public void removeSale(Sale sale) {
		// TODO - implement Session.removeSale
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes amount that is big decimal as parameter
	 * calculates the difference between the amount at beginning and ending of session
	 * returns difference as bigdecimal
	 * @param cash
	 */
	public BigDecimal calcCashCountDiff(BigDecimal cash) {
		// TODO - implement Session.calcCashCountDiff
		throw new UnsupportedOperationException();
	}

	/**
	 * method that calculates the total amount of a session
	 * returns amount as big decimal
	 */
	public BigDecimal calcTotal() {
		// TODO - implement Session.calcTotal
		throw new UnsupportedOperationException();
	}

	/**
	 * returns a string representation of class session
	 */
	public String toString() {
		// TODO - implement Session.toString
		throw new UnsupportedOperationException();
	}

}