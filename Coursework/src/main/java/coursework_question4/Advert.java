/**
 * Advert.java
 */
package coursework_question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines properties and behaviour of a car advert.
 *  
 * @author as02795
 */
public class Advert {

  /** The car to be advertised. */	
  private Car car;
  
  /** The list of offers made for the car. */
  private List<Offer> offers;
		
  /** Constructor. Sets the value of the Car field.
   * 
   * @param car
   * 		  The car to be advertised.
   * 
   * @throws IllegalArgumentException
   * 		  If car parameter is passed as null.
   */
  public Advert(Car car) {
    this.car = car;
    
	if (car == null) {
	  throw new IllegalArgumentException("Car must exist.");
	}
	this.offers = new ArrayList<Offer>();
	}
		
  /**
   * Method. Accessor for the car field.
   * 
   * @return
   * 		  The value of the car field.
   */
  public Car getCar() {
    return this.car;
  }

  /**
   * Method. Returns the current highest offer in the list of offers.
   * This is done by mapping the value of the offers as 'keys' to the 
   * offer object that they correspond to, as 'elements'. 
   * Collections.max returns the maximum value in the key-set, and 
   * thus map .get() method is used to return the offer associated.
   * 
   * @return
   * 		  The offer object with the maximum value field.
   */
  public Offer getHighestOffer() {
	Map<Double, Offer> map = new HashMap<Double, Offer>();
			
	for (Offer offer : this.offers) {
	  map.put(offer.getValue(), offer);
	}
	return map.get(Collections.max(map.keySet()));
  }
		
  /**
   * Method. Updates the list of offers with the offer specified
   * by the buyer and value parameters.
   * 
   * @param buyer
   * 		  The buyer making the offer.
   * @param value
   * 		  The amount being offered.
   * 
   * @return
   * 		  True if successful, False if not.
   * 
   * @throws IllegalArgumentException
   * 		  If the buyer is passed as null, the offer is the same as
   * 		  the one previously placed, or the amount offered is a
   * 		  negative value.
   */
  public boolean placeOffer(User buyer, double value) {
	boolean placed = false;
	
	if (buyer == null) {
	    throw new IllegalArgumentException("Buyer must exist.");
	} else if (value < 0) {
	    throw new IllegalArgumentException("Offer cannot be less than 0.");
	} else if (buyer != (Buyer) buyer) {
		throw new IllegalArgumentException("Only a buyer can place an offer.");
	} else if (!this.offers.isEmpty()) { 
		if (value <= getHighestOffer().getValue()) {
		return placed;
		}
	}
	
	for (Offer offer : this.offers) {
	  if (offer.getBuyer() == buyer) {
		    offer.setValue(value);
		    placed = true;
		}
	}
	this.offers.add(new Offer(buyer, value));
	placed = true;
	return placed;
	}
  
  /**
   * Method. Returns the car specification in the form of an advert.
   * 
   * @return
   * 		  Advert of the car as a string.
   */
  @Override
  public String toString() {
	return "Ad: " + this.car.displayCarSpecification();
  }
		
		
}
