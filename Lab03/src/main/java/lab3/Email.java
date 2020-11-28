/**
 * 
 */
package lab3;

/**
 * @author as02795
 *
 */
public class Email {
	private static final String DEFAULT_ADDRESS = "unknown@unknown";
	private String emailAddress = DEFAULT_ADDRESS;

	public Email(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String addy) {
		this.emailAddress = addy;
	}

}
