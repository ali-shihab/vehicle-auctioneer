/**
 * 
 */
package lab8_exercise3;

/**
 * @author as02795
 *
 */
public class InvalidSurnameException extends Exception{

	/** serialVersionUID */
	private static final long serialVersionUID = -5126816848483176702L;

	/**
	* Default constructor: fill in the message automatically.
	*/
	public InvalidSurnameException() {
		super("Invalid surname");
	}

	/**
	 * Allow a specific message to be included.
	 * 
	 * @param message The specific message.
	 */
	public InvalidSurnameException(String message) {
		super(message);
	}
}
