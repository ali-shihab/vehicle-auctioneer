/**
 * Dealership.java
 */
package coursework_question3;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Defines the properties and behaviour of a dealership.
 * 
 * @author as02795
 */
public abstract class Dealership {

	  /** The name of the dealership. */
	  private String name = null;
	  
	  /** The map of cars currently for sale and the sellers of said cars. */
	  protected Map<Advert, User> carsForSale = null;
	  
	  /** The map of cars, that were sold, and the sellers of said cars. */
	  protected Map<Advert, User> soldCars = null;
	  
	  /** The map of unsuccessful car listings and the sellers of said cars. */
	  protected Map<Advert, User> unsoldCars;
	  
	  /** 
	   * Super constructor. Sets the maps for the respective advert categories and
	   * the value of the dealership's name field.
	   * 
	   * @param name
	   * 		  Name of the dealership.
	   * 
	   * @throws IllegalArgumentException
	   * 		  If the name is null. Name isn't validated against a regex
	   * 		  because the unit test allows for "AutoTrader" and
	   * 		  "Auto Auction" to both be created.
	   */
	  public Dealership(String name) {
		super();
		if (name == null) {
			throw new IllegalArgumentException("Name not valid.");
		}
	    this.name = name;
		this.carsForSale = new HashMap<Advert, User>();
		this.soldCars = new HashMap<Advert, User>();
		this.unsoldCars = new HashMap<Advert, User>();
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
		  out.append(advert.getCar().getID() + " - Purchased by " 
		  + advert.getHighestOffer().getBuyer().toString()
	      + " with a successful £" + 
		  format.format(advert.getHighestOffer().getValue()) + " bid. \n" );
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
	   * Method. Used to place offer on a car if the advert for that
	   * car is listed in the carsForSale map. This method uses the 
	   * boolean return value of the placeOffer method of the Advert
	   * class. It also uses any exceptions that it throws.
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
	   * 		  a negative number is passed for value.
	   */
	  public boolean placeOffer(Advert carAdvert, User user, double value) {

		if (carAdvert == null || user == null) {
			throw new IllegalArgumentException("Cannot enter null values.");
		} else if (this.carsForSale.containsKey(carAdvert)) {
		    return carAdvert.placeOffer(user, value);
		} else {
			throw new IllegalArgumentException("Advert does not exist.");
	    }
	  }
	  
	  /**
	   * Method. Registers a car to the carsForSale map if it hasn't 
	   * been registered before. 
	   * Due to the specification of this coursework, if an unsold car 
	   * needs to be re-listed, or a bought car would like to be resold, 
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
	   * 		  already been sold, or the listing ended without sale.
	   */
	  public void registerCar(Advert carAdvert, User user, String colour, CarType type, CarBody body, int noOfSeats) {
		  
	    if (carAdvert == null || user == null || colour == null || type == null || body == null || noOfSeats == 0) {
	        throw new IllegalArgumentException("Cannot pass a null value");
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
