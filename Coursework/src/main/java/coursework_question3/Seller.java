/**
 * Seller.java
 */
package coursework_question3;

import java.util.StringTokenizer;

/**
 * Defines properties and behaviour of a seller.
 * 
 * @author as02795
 */
public class Seller extends User {

  /**
   * Constructor. Calls super parameterised
   * constructor.
   * 
   * @param name
   * 		  The seller's name.
   */
  public Seller (String name) {
	super(name); 
  }
  
  /**
   * Method. Returns the seller's name in the form
   * "Bob R.", where "Bob" = first name, "R" = initial
   * of last name.
   * 
   * @return
   * 		  the seller's name as "Bob R.".
   */
  @Override
  public String toString() {
	// TODO Auto-generated method stub
	StringTokenizer tokens = new StringTokenizer(super.toString());
	StringBuffer out = new StringBuffer(tokens.nextToken());
	out.append(" " + tokens.nextToken().charAt(0) + ". ()");
	return out.toString();
  }

}
