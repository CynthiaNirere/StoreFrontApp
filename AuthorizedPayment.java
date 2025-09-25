/**
 * Class Authorized payment represents whether a payment is valid or not
 */
public class AuthorizedPayment extends Payment {

	/**
	 * Stores a unique authorization code of payment
	 */
	private String authorizationCode;

	/**
	 * Method that check if payment is authorized
	 * Returns true or false
	 */
	public Boolean isAuthorized() {
		// TODO - implement AuthorizedPayment.isAuthorized
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to Validate whether payment will count as cash
	 * Returns true or false
	 */
	public Boolean countAsCash() {
		// TODO - implement AuthorizedPayment.countAsCash
		throw new UnsupportedOperationException();
	}

}