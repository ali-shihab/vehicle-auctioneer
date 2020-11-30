/**
 * 
 */
package lab5_exercise2;

/**
 * @author as02795
 *
 */
public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	public GasBill(String accountNumber, double amount, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public boolean checkAccountAccuracy() {
		return (this.accountNumber.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}"));
	}
	
	public String getCustomer() {
		return customer.toString();
	}
	
	public String displayAccountDetails() {
		
		if (!checkAccountAccuracy()) {
			this.accountNumber = "Invalid Account";
		}
		
		return "Gas Bill\n" + " Account Number:" + this.accountNumber + "\n" 
	+ " Customer:" + getCustomer() + "\n"
	+ " Amount due:" + this.amount + "0";
	}
	
	private String displayAmountDue() {
		return String.valueOf(this.amount);
	}
}

