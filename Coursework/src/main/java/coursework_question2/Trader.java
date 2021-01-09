/**
 * Trader.java
 */
package coursework_question2;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * NOTE: Due to the JUnit tests, the moment an offer that is
 * lower than the reserved price is placed, the advert is 
 * delisted and put in the unsoldCars map.
 * 
 * Defines the properties and behaviour of an trader.
 * 
 * @author as02795
 */
public class Trader {

  /** The name of the trader. */
  private String name = null;
  
  /** The map of cars currently for sale and the sellers of said cars. */
  protected Map<Advert, User> carsForSale = null;
  
  /** The map of cars, that were sold, and the sellers of said cars. */
  protected Map<Advert, User> soldCars = null;
  
  /** The map of unsuccessful car listings and the sellers of said cars. */
  protected Map<Advert, User> unsoldCars = null;
  
  /** 
   * NOTE: Name isn't validated against a regex because the unit test 
   * allows for "Stella" and "Adam Hills" to both be created.
   * 
   * Constructor. Sets the maps for the respective advert categories and
   * the value of the auctioneer's name field.
   * 
   * @param name
   * 		  Name of the Trader.
   * 
   * @throws IllegalArgumentException
   * 		  If the name is null.
   */
  public Trader(String name) {
	if (name == null) {
		throw new IllegalArgumentException("Name not valid.");
	}
    this.name = name;
	this.carsForSale = new HashMap<Advert, User>();
	this.soldCars = new HashMap<Advert, User>();
	this.unsoldCars = new HashMap<Advert, User>();
  }
		
  /**
   * Method. Checks if the specified car is currently for sale.
   * No validation required as it is called locally by methods
   * which would have already performed validation.
   * 
   * @param car
   * 		  The car to check for the presence of in the 
   * 		  'for sale' map of adverts.
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
   * Method. Returns cars sold and the details of the sale.
   * 
   * @return
   * 		  A string showing the car ID, the buyer, and the
   * 		  amount paid.
   */
  public String displaySoldCars() {
	StringBuffer out = new StringBuffer("SOLD CARS:\n");
	DecimalFormat format = new DecimalFormat("0.00");
	for (Advert advert : this.soldCars.keySet()) {
	  out.append(advert.getCar().getID() + " - Purchased by " + advert.getHighestOffer().getBuyer().getName()
				  + " with a successful £" + format.format(advert.getHighestOffer().getValue()) + " bid. \n" );
	}
	return out.toString();
  	}
		
  /**
   * Method. Returns the word "Statistics".
   * @return
   */
  public String displayStatistics() {
    return "Statistics";
  }
  
  /**
   * Method. Returns the adverts of the cars which were not sold, 
   * due to having unsuccessful offers.
   * 
   * @return
   * 		  List of adverts of cars that weren't sold.
   */
  public String displayUnsoldCars() {
	StringBuffer out = new StringBuffer("UNSOLD CARS:\n");
	for (Advert advert : this.unsoldCars.keySet()) {
	  out.append(advert.toString() + "\n");
	}
	return out.toString();
  }
  
  /**
   * NOTE: Due to the JUnit tests, the moment an offer that is
   * lower than the reserved price is placed, the advert is 
   * delisted and put in the unsoldCars map.
   * 
   * Method. Called to end a listing. Checks if the car is being
   * sold. If it is, checks if the highest offer for the car is
   * above or below the reserved price of the car. If higher, it
   * moves the car to the sold cars map. If lower, the listing 
   * was unsccessful, so it is moved to the unsold cars map.
   * 
   * Not a lot of validation needs to be exist in this method as
   * it is performed in the calling method, placeOffer.
   * 
   * @param advert
   * 		  the advert that is being ended.
   * 
   * @throws IllegalArgumentException
   * 		  If advert parameter is passed as null, or if advert
   * 		  is not in the map of cars being sold.
   */
  private void endSale(Advert advert) {
	if (advert.getHighestOffer().getValue() >= advert.getCar().getPrice()) {
		this.soldCars.put(advert, this.carsForSale.get(advert));
		this.carsForSale.remove(advert);
	} else {
		  this.unsoldCars.put(advert, this.carsForSale.get(advert));
		  this.carsForSale.remove(advert);
	}
  }
  
  /**
   * Method. Used to place offer on a car if the advert for that
   * car is listed in the carsForSale map and the sale type of the
   * advert is FORSALE, not AUCTION. This method uses the boolean
   * return value of the placeOffer method of the Advert class. 
   * It also uses any exceptions that it throws. It then calls
   * endSale to de-list the advert.
   * 
   * @param carAdvert
   * 		  The advert to place the order on.
   * @param user
   * 		  The bidder.
   * @param value
   * 		  The amount being offered.
   * 
   * @return
   * 		  True if offer was placed, false if not placed.
   * 
   * @throws IllegalArgumentException
   * 		  If null is passed for carAdvert or user, or if
   * 		  a negative number is passed for value, or if car
   * 		  SaleType is AUCTION.
   */
  public boolean placeOffer(Advert carAdvert, User user, double value) {
	boolean sold = false;
	if (carAdvert == null || user == null) {
		throw new IllegalArgumentException("Cannot enter null values.");
	} else if (carAdvert.getCar().getType() != SaleType.FORSALE) {
    	throw new IllegalArgumentException("Car is registered for auction, not sale.");
	} else if (this.carsForSale.containsKey(carAdvert)) {
	    sold = carAdvert.placeOffer(user, value);
	    endSale(carAdvert);
	} else {
		throw new IllegalArgumentException("Advert does not exist.");
    }
	return sold;
  }

  /**
   * Method. Registers to the carsForSale maps a car if it hasn't 
   * been registered before and is available for sale, not auction. 
   * Due to the specification of this coursework, if an unsold car 
   * needs to be relisted, or a bought car would like to be resold, 
   * a new advert needs to be made for it before it can be registered.
   * 
   * @param carAdvert
   * 		  The advert to register.
   * @param user
   * 		  The user trying to sell the car.
   * @param colour
   * 		  The colour of the car.
   * @param type
   * 		  The type of transmission of the car.
   * @param body
   * 		  The body type of the car.
   * @param noOfSeats
   * 		  The number of seats that the car has.
   * 
   * @throws IllegalArgumentException
   * 		  If a null value is passed for any of the parameters,
   * 		  the car is already being advertised, the car has
   * 		  already been sold, or the listing ended without sale, or
   * 		  the car SaleType is AUCTION.
   */
  public void registerCar(Advert carAdvert, User user, String colour, CarType type, CarBody body, int noOfSeats) {
			
    if (carAdvert == null || user == null || colour == null || type == null || body == null || noOfSeats == 0) {
        throw new IllegalArgumentException("Cannot pass a null value");
    } else if (carAdvert.getCar().getType() != SaleType.FORSALE) {
    	throw new IllegalArgumentException("Car is registered for auction, not sale.");
    } else if (checkExistence(carAdvert.getCar())) {
    	throw new IllegalArgumentException("An advert already exists for this car.");
    } else if (soldCars.containsKey(carAdvert)) {
    	throw new IllegalArgumentException("This car has already been sold.");
    } else if (unsoldCars.containsKey(carAdvert)) {
    	throw new IllegalArgumentException("This car's listing has already ended.");
    } else {
		carAdvert.getCar().setColour(colour);
		carAdvert.getCar().setGearbox(type);
		carAdvert.getCar().setBody(body);
		carAdvert.getCar().setNumberOfSeats(noOfSeats);
		this.carsForSale.put(carAdvert, user);
	}		
  }		
}