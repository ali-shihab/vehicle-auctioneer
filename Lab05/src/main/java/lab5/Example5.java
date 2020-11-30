/**
 * 
 */
package lab5;

/**
 * @author as02795
 *
 */
public class Example5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define a reference number which must start with "HO" followed by 4 digits.
		String reference = "HO1234";
		
		boolean foundMatch = reference.matches("(HO)([0-9]{4})"); 
		
		if(foundMatch) {
		System.out.println("Reference number is valid");
		} else {
		System.out.println("Reference number is NOT valid");
		}
	}

}
