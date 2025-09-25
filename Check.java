/**
 * Check is a class that represents how a check transaction occurs
 */
public class Check extends AuthorizedPayment {

	/**
	 * Stores the routing number associated with check
	 */
	private String routingNumber;
	/**
	 * Stores account number from which the check will be drawn
	 */
	private String accountNumber;
	/**
	 * Stores the unique check number that is the check
	 */
	private String checkNumber;

	/**
	 * Default Constructor
	 */
	public Check() {
		// TODO - implement Check.Check
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor with account number and check number as parameters
	 * @param amount
	 * @param accountNumber
	 */
	public Check(String amount, String accountNumber) {
		// TODO - implement Check.Check
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to verify if check is authorized and returns true or false
	 */
	public Boolean isAuthorized() {
		// TODO - implement Check.isAuthorized
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns a string representation of check class
	 */
	public String toString() {
		// TODO - implement Check.toString
		throw new UnsupportedOperationException();
	}

}