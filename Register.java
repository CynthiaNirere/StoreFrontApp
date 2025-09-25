import java.util.*;

/**
 * Class register that stores register related information such as store sessions and cashdrawers in store
 */
public class Register {

	/**
	 * specific number of register in the store
	 */
	private String number;
	/**
	 * object of cash drawer that will be able to access methods from cashDrawer class
	 * stores cashDrawer used by register
	 */
	private CashDrawer cashDrawer;
	/**
	 * object that will be able to access methods of session class.
	 * Stores session in which register was used
	 */
	private Collection<Session> session;

	/**
	 * default constructor
	 */
	public Register() {
		// TODO - implement Register.Register
		throw new UnsupportedOperationException();
	}

	/**
	 * constructor that takes unique number of register as parameter
	 * @param number
	 */
	public Register(String number) {
		// TODO - implement Register.Register
		throw new UnsupportedOperationException();
	}

	/**
	 * returns a string representation of the class register
	 */
	public String toString() {
		// TODO - implement Register.toString
		throw new UnsupportedOperationException();
	}

}