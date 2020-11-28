package lab3;

/**
 * A class to model a simple electronic mail. The item has sender and recipient
 * addresses and a message string.
// * 
// * @author Stella Kazamia
// */
public class Mail {
	// The sender of the item.
	private User sender = null;
	// The intended recipient.
	private User recipient = null;
	// The text of the message.
	private String message = null;

	/**
	 * Create a mail item from sender to the given recipient, containing the given
	 * message.
	 * 
	 * @param sender    The sender of this item.
	 * @param recipient The intended recipient of this item.
	 * @param message   The text of the message to be sent.
	 */
	public Mail(User sender, User recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}

	/**
	 * @return The sender of this message.
	 */
	public String getSender() {
		return sender.toString();
	}

	/**
	 * @return The intended recipient of this message.
	 */
	public User getRecipient() {
		return recipient;
	}

	/**
	 * @return The text of the message.
	 */
	public String getMessage() {
		return message;
	}
	
	private void isEmpty() {
		 if(this.getMessage() == null||this.getMessage() == "") {
			 this.message = "** Something went wrong! **";
		 } else {
				 
		 }
	}

	/**
	 * Print this mail message to the text terminal.
	 */
	public void print() {
		
		System.out.println("From: " + this.sender);
		System.out.println("To: " + this.recipient);
		
		this.isEmpty();
		
		System.out.println("Message: " + this.message);
	}
}

