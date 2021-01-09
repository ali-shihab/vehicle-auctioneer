/**
 * Seller.java
 */
package coursework_question4;

import java.util.StringTokenizer;

/**
 * Defines properties and behaviour of a seller.
 * 
 * @author as02795
 */
public class Seller extends User {

  /** The amount of sales the seller has made. */;
  private int sales = 0;
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
   * Methods. Accessor and Mutator for the seller's sales.
   * 
   * @param sales
   * 		  the number of sales made by the seller.
   * @return
   * 		  the number of sales made by the seller.
   */
  public int getSales() {
	return this.sales;
  }
  
  public void addSale() {
	  this.sales++;
  }
  
  /**
   * Method. Returns the sellers rating.
   * 
   * @return
   * 		  the seller's rating
   */
  public String identifyRating() {
    if (getSales() == 0) {
      return "Level 0";
    } else if (getSales() < 6) {
      return "Level 1";
    } else if (getSales() < 11) {
      return "Level 2";
    } else {
      return "Level 3";
    }
  }
  
  /**
   * Method. Returns the seller's name + their sales an their rating.
   * 
   * @return
   * 		  the seller's name as "Bob R.".
   */
  @Override
  public String toString() {
	// TODO Auto-generated method stub
	StringTokenizer tokens = new StringTokenizer(super.toString());
	StringBuffer out = new StringBuffer(tokens.nextToken());
	out.append(" " + tokens.nextToken().charAt(0) + ". (Sales: " + getSales() + ", Rating: " + identifyRating() + ")");
	return out.toString();
  }

}
