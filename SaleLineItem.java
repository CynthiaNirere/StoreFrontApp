/**
 * Class SaleLine Item represents how items are sold in sale line
 */
public class SaleLineItem {

	/**
	 * Stores quantity of Item being sold
	 */
	private int quantity;
	/**
	 * Stores sale to which line item belongs
	 */
	private Sale sale;
	/**
	 * Stores the item being sold in the line item
	 */
	private Item item;

	/**
	 * Default constructor
	 */
	public SaleLineItem() {
		// TODO - implement SaleLineItem.SaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor takes sale, item and quantity as parameters
	 * @param sale
	 * @param item
	 * @param quantity
	 */
	public SaleLineItem(Sale sale, Item item, String quantity) {
		// TODO - implement SaleLineItem.SaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculates the subtotal for the line item
	 * Returns amount as big decimal
	 */
	public BigDecimal calcSubTotal() {
		// TODO - implement SaleLineItem.calcSubTotal
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculates the tax amount for the line item
	 * Returns tax as big decimal
	 */
	public BigDecimal calcTax() {
		// TODO - implement SaleLineItem.calcTax
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns string representation for saleLineItem class
	 */
	public String toString() {
		// TODO - implement SaleLineItem.toString
		throw new UnsupportedOperationException();
	}

}