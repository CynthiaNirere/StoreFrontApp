/**
 * Class Payment to handle how payments are done
 */
public abstract class Payment {

	/**
	 * Stores total amount to be payed
	 */
	private BigDecimal amount;
	/**
	 * Stores total amount that customer provides
	 */
	private BigDecimal amtTendered;

	/**
	 * Method that checks if payment should be counted as cash
	 * returns true or false accordingly
	 *  
	 */
	public Boolean countAsCash() {
		// TODO - implement Payment.countAsCash
		throw new UnsupportedOperationException();
	}

}