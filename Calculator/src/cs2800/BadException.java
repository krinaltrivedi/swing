package cs2800;

/**
 * This class is used to give a message when the Type requested by the user 
 * doesn't exist. It simply gives the message "Invalid".
 * @author Krinal
 *
 */

public class BadException extends Exception {

	/**
	 * This number is used to ensure that a loaded class corresponds exactly to
	 * a serialised object. 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor uses the super constructor to generate the message "Invalid".
	 */
	BadException() {
		super("Invalid");
	}
}
