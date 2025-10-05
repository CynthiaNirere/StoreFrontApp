import java.util.*;

public class StoreFront {

	Admin adminStore;
	Collection<CustomerOrder> orderStore;
	Promo promoStore;
	Collection<Item> itemStore;
	private int storeID;
	private String address;
	private localDate openHours;
	private String storeName;
	private Item item;
	private TaxCategory taxCategories;
	private Promo promo;

	public StoreFront() {
		// TODO - implement StoreFront.StoreFront
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void addItem(item item) {
		// TODO - implement StoreFront.addItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement StoreFront.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param category
	 */
	public TaxCategory findItemByTaxCategory(String category) {
		// TODO - implement StoreFront.findItemByTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxCategory
	 */
	public void addTaxCategory(TaxCategory taxCategory) {
		// TODO - implement StoreFront.addTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxCategory
	 */
	public void removeTaxCategory(TaxCategory taxCategory) {
		// TODO - implement StoreFront.removeTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void removeUPC(UPC upc) {
		// TODO - implement StoreFront.removeUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void removeItem(Item item) {
		// TODO - implement StoreFront.removeItem
		throw new UnsupportedOperationException();
	}

}