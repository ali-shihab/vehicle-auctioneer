/**
 * Trader.java
 */
package coursework_question2;

import java.util.Map;

/**
 * Defines properties and behaviour of a trader.
 * 
 * @author as02795
 */
public abstract class Trader extends Auctioneer {

  /** The name of the auctioneer. */
  private String name;
	  
  /** The mapping of cars currently for sale to the sellers of said cars. */
  protected Map<Advert, User> carsForSale;
	  
  /** The mapping of cars that were sold to the sellers of said cars */
  protected Map<Advert, User> soldCars;
	  
  /** The mapping of unsuccessful car listings to the sellers of said cars. */
  protected Map<Advert, User> unsoldCars;
	  
  public Trader(String name) {
	this.name = name;
	super.carsForSale = carsForSale;
	super.soldCars = soldCars;
	super.unsoldCars = unsoldCars;
  }

}
