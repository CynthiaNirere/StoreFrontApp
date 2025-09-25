import java.util.*;

/**
 * The Store class represents a retail store entity
 */
public class Store {

	/**
	 * Stores identification number of store
	 */
	private String number;
	/**
	 * Stores the name of the store
	 */
	private String name;
	/**
	 * Stores registers in the store
	 */
	private Collection<Register> registers;
	/**
	 * Stores sessions conducted in the store
	 */
	private Collection<Session> sessions;
	/**
	 * Stores cashiers working at the store
	 */
	private Collection<Cashier> cashiers;
	/**
	 * Stores items available in store
	 */
	private Collection<Item> items;
	/**
	 * Stores Universal Product Code used for items in store
	 */
	private Collection<UPC> upcs;
	/**
	 * Store the TaxCategories associated with items in the store
	 */
	private Collection<TaxCategory> taxCategories;

	/**
	 * Default Constructor
	 */
	public Store() {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor with store number and store name
	 * @param number
	 * @param name
	 */
	public Store(String number, String name) {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to add an item to the store invetory.
	 * Takes item object as parameter
	 * @param item
	 */
	public void addItem(Item item) {
		// TODO - implement Store.addItem
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to remove item from inventory.
	 * Takes item object as parameter
	 * @param item
	 */
	public void removeItem(Item item) {
		// TODO - implement Store.removeItem
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to add UPC to stores upc list
	 * Takes UPC object as parameter
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Store.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to remove UPC from stores upc list
	 * Takes UPC object as parameter
	 * @param upc
	 */
	public void removeUPC(UPC upc) {
		// TODO - implement Store.removeUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to add a register to store.
	 * Takes register object as parameter
	 * @param register
	 */
	public void addRegister(Register register) {
		// TODO - implement Store.addRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to remove a register from store.
	 * Takes register object as parameter
	 * @param register
	 */
	public void removeRegister(Register register) {
		// TODO - implement Store.removeRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to add cashier to store's staff
	 * Takes cashier object as parameter
	 * @param cashier
	 */
	public void addCashier(Cashier cashier) {
		// TODO - implement Store.addCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to remove cashier from store's staff
	 * Takes cashier object as parameter
	 * @param cashier
	 */
	public void removeCashier(Cashier cashier) {
		// TODO - implement Store.removeCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to add a tax category to store
	 * Takes an object of tax category as parameter
	 * @param taxCategory
	 */
	public void addTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.addTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to remove a tax category from store
	 * Takes an object of tax category as parameter
	 * @param taxCategory
	 */
	public void removeTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.removeTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to add a session to store
	 * Takes object of session as parameter
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Store.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to remove a session from store
	 * Takes object of session as parameter
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Store.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to find a register by using or referencing its number
	 * Takes number of register as parameter
	 * Returns an object of register when found
	 * @param number
	 */
	public Register findRegisterbyNumber(String number) {
		// TODO - implement Store.findRegisterbyNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to find an item by using or referencing its upc
	 * Takes upc of the item as parameter
	 * Returns an object of Item when found
	 * @param upc
	 */
	public Item findItemForUPC(String upc) {
		// TODO - implement Store.findItemForUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to find an item by using or referencing its number
	 * Takes number of item as parameter
	 * Returns an object of Item when found
	 * @param number
	 */
	public Item findItemForNumber(String number) {
		// TODO - implement Store.findItemForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to find a cashier by using or referencing its number
	 * Takes number of cashier as parameter
	 * Returns an object of Cashier when found
	 * @param number
	 */
	public Cashier findCashierForNumber(String number) {
		// TODO - implement Store.findCashierForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to find a taxCategory by using or referencing its name
	 * Takes name of taxCategory as parameter
	 * Returns an object of taxCategory when found
	 * @param category
	 */
	public TaxCategory findTaxCategorybyName(String category) {
		// TODO - implement Store.findTaxCategorybyName
		throw new UnsupportedOperationException();
	}

	/**
	 * Method to return a string representation of Store Class
	 */
	public String toString() {
		// TODO - implement Store.toString
		throw new UnsupportedOperationException();
	}

}