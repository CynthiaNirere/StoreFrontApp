import java.util.*;

public class Item {

	Collection<StoreFront> storeItem;
	Collection<OrderLineItem> orderLine;
	Collection<UPC> UPCsItem;
	Collection<Price> priceItem;
	private String description;
	private String itemNumber;
	private CustomerOrder customerOrder;
	private UPC upcs;
	private TaxCategory taxCategory;

	public Item() {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	public void getPriceForQuantity() {
		// TODO - implement Item.getPriceForQuantity
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void addPrice(Price price) {
		// TODO - implement Item.addPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void removePrice(Price price) {
		// TODO - implement Item.removePrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public BigDecimal getTaxRateForDate(LocalDate date) {
		// TODO - implement Item.getTaxRateForDate
		throw new UnsupportedOperationException();
	}

}