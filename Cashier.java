import java.util.*;

/**
 * Class Cashier that handles details about cashiers in store.
 */
public class Cashier {

	/**
	 * stores unique id number of cashier
	 */
	private String number;
	/**
	 * stores unique password for a cashier
	 */
	private String password;
	/**
	 * object of person that will be able to access methods of Person class
	 */
	private Person person;
	/**
	 * object of session class that will store session details
	 */
	private Collection<Session> sessions;

	/**
	 * default constructor
	 */
	public Cashier() {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor that takes unique id number, object of person and password as parameter.
	 * Sets them respectively.
	 * @param number
	 * @param person
	 * @param password
	 */
	public Cashier(String number, Person person, String password) {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes object of session
	 * adds it to cashier's session accordinlgy
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Cashier.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes object of session
	 * deletes session from cashier's accordingly
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Cashier.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * method that takes password as parameter
	 * checks whether a password is authorized or not
	 * @param password
	 */
	public void isAuthorized(String password) {
		// TODO - implement Cashier.isAuthorized
		throw new UnsupportedOperationException();
	}

	/**
	 * returns a string representation of the class Cashier
	 */
	public String toString() {
		// TODO - implement Cashier.toString
		throw new UnsupportedOperationException();
	}

}