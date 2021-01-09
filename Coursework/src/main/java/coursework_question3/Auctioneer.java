/**
 * Auctioneer.java
 */

package coursework_question3;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines the properties and behaviour of an auctioneer.
 * 
 * @author as02795
 */
public class Auctioneer extends Dealership {
  
  /** The map of sellers and the amount of sales they have made. */
  private Map<Seller, Integer> sales = null;
  
  /** The seller with the most sales. */
  private Seller topSeller = null;
  
  /** 
   * Calls the super constructor, sets the sales map and the value 
   * of the topSeller field. Throws exceptions defined in superclass.
   * 
   * @param name
   * 		  Name of the auctioneer.
   */
  public Auctioneer(String name) {
	super(name);
	this.topSeller = null;
	this.sales = new HashMap<Seller, Integer>();
  }
		
  /**
   * Method. Checks and indicates if the specified car is
   * currently for sale.
   * 
   * @param car
   * 		  The car to check for the presence of in the 
   * 		  carForSale map of adverts.
   * 
   * @return
   * 		  True if it is for sale, false if not.
   */
  private boolean checkExistence(Car car) {
	boolean exists = false;
	
	for (Advert advert: this.carsForSale.keySet()) {
	  if (advert.getCar() == car) {
		exists = true;
	  }
    }
  return exists;
  }
  
  /**
   * Method. Called to end a listing. Checks if the car is up for 
   * auction. If it is, checks if the highest offer for the car is
   * above or below the reserved price of the car. If higher, it
   * moves the car to the sold cars map. If lower, the listing 
   * was unsccessful, so it is moved to the unsold cars map.
   * 
   * @param advert
   * 		  the advert that is being ended.
   * 
   * @throws IllegalArgumentException
   * 		  If advert parameter is passed as null, or if advert
   * 		  is not in the map of cars being sold.
   */
  public void endSale(Advert advert) {
	if (advert == null) {
	    throw new IllegalArgumentException("Advert cannot be null.");
	} else if (advert.getCar().getType() != SaleType.AUCTION) {
    	throw new IllegalArgumentException("Car is registered for sale, not auction.");
	} else if (checkExistence(advert.getCar())) 
		if (advert.getHighestOffer().getValue() >= advert.getCar().getPrice()) {
		  this.soldCars.put(advert, this.carsForSale.get(advert));
		  this.carsForSale.remove(advert);
	  } else {
		  this.unsoldCars.put(advert, this.carsForSale.get(advert));
		  this.carsForSale.remove(advert);
	} else {
		throw new IllegalArgumentException("Advert does not exist on.");
	}
  }
}
