/**
 * Class promo Price that represents how effective promo prices are in store
 */
public class PromoPrice extends Price {

	/**
	 * Stores the end date of the promotional price period
	 */
	private LocalDate endDate;

	/**
	 * Default Constructor
	 */
	public PromoPrice() {
		// TODO - implement PromoPrice.PromoPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor that takes the promo price, effective date and end date as parameter
	 * @param price
	 * @param effectiveDate
	 * @param endDate
	 */
	public PromoPrice(String price, String effectiveDate, String endDate) {
		// TODO - implement PromoPrice.PromoPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * Method that checks if the promotion price is effective on a given date
	 * Takes date as object parameter
	 * @param date
	 */
	public Boolean isEffective(LocalDate date) {
		// TODO - implement PromoPrice.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns a string representation for the class PromoPrice
	 */
	public String toString() {
		// TODO - implement PromoPrice.toString
		throw new UnsupportedOperationException();
	}

}