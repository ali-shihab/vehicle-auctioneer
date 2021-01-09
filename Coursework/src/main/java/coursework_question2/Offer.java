/**
 * Offer.java
 */
package coursework_question2;

/**
 * Defines  properties an offer.
 * 
 * @author as02795
 */
public class Offer {

  /** The value of the offer made by the buyer. */
  private double value = 0;
  
  /** The buyer in question */
  private User buyer = null;
		
  /** Constructor. Sets the field values. 
   * 
   * @param buyer
   *		  The buyer.
   *
   * @param value
   * 		  The value of the offer.
   * 
   * @throws IllegalArgumentException
   * 		  If the buyer is passed as null or a negative value is passed.
   */
  public Offer(User buyer, double value) throws IllegalArgumentException {
    
	if (buyer == null) {
	  throw new IllegalArgumentException("Buyer can not be null.");
	}
	this.buyer = buyer;
			
	if (value < 0) {
	  throw new IllegalArgumentException("Offer cannot be less than 0.");
	}
	this.value = value;
	}
  
  /**
   * Methods. An Accessor for buyer field
   * and an Accesor + Mutator for the value field.
   * 
   * @return
   */
  public User getBuyer() {
	return this.buyer;
  }
		
  public double getValue() {
	return this.value;
  }
  
  public void setValue(double value) {
	this.value = value;
  }
  
  /**
   * Method. Returns the offer made by the buyer.
   * 
   * @return
   * 		  The buyer's offer as a string.
   */
  @Override
  public String toString() {
	return buyer.toString() + " offered £" + this.value;
  }		
}
