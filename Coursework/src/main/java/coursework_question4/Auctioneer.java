/**
 * Auctioneer.java
 */

package coursework_question4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
   * was unsuccessful, so it is moved to the unsold cars map.
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
		  updateStatistics((Seller) this.soldCars.get(advert));
	  } else {
		  this.unsoldCars.put(advert, this.carsForSale.get(advert));
		  this.carsForSale.remove(advert);
	} else {
		throw new IllegalArgumentException("Advert does not exist on.");
	}
  }
  
  /**
   * Method. Returns the sum of the sales in the sales map.
   * 
   * @return
   * 		  sum of the sales.
   */
  private int getTotalSales() {
	int total = 0;
	for (int amountSold : sales.values()) {
		total += amountSold;
	}
	return total;
  }
  
  /**
   * Method. Updates the top seller.
   */
  private void updateTopSeller() {
    Map<Integer, Seller> map = new HashMap<Integer, Seller>();
		
	for (Seller seller : this.sales.keySet()) {
		map.put(this.sales.get(seller), seller);
	}
	this.topSeller = map.get(Collections.max(map.keySet()));
  }
  
  /**
   * Method. Updates the sellers sales field, then updates the sales map
   * with the new data, then updtes the topSeller field. Calls the
   * saveInFile method to update the file with the statistics in the 
   * specified format
   * 
   * @param seller
   * 		  the seller's statistics to be updated.
   */
  private void updateStatistics(Seller seller) {
	seller.addSale();
	this.sales.put(seller, seller.getSales());
	updateTopSeller();
	saveInFile(getTotalSales(), percentageSoldOfGearbox(CarType.MANUAL),
			percentageSoldOfGearbox(CarType.AUTOMATIC));
  }
  
  /**
   * Method. Calculates percentage sold of the specified car type for the
   * specified seller. Local variables gearboxTotal and sold represent the
   * total cars sold of the specified gearbox type and the total number of
   * cars sold, respectively. They are declared as doubles to avoid issues
   * in the calculation of the percentage (declaring them as int causes an
   * automatic rounding down to 0 pre-casting to double, so casting 
   * is not affective).
   * 
   * @param CarType
   * 		  the type of car sold that needs to be calculated as a percentage.
   * 
   * @return
   * 		  percentage sold of specified cartype.
   */
  private double percentageSoldOfGearbox(CarType gearbox) {
	double gearboxTotal = 0;
	double sold = 0;
	for (Advert advert : this.soldCars.keySet()) {
		  sold++;
		  if (advert.getCar().getGearbox() == gearbox) {
			  gearboxTotal++;
		  }
	}
	return (gearboxTotal/sold)*100.0;
  }
  
  /**
   * Method. Saves the statistics in the file in the specified format.
   * 
   * @param noOfSales
   * 		  total number of sales by the auctioneer.
   * @param percentageManual
   * 		  percentage of Manual cars sold.
   * @param percentageAutomatic
   * 		  percentage of Automatic cars sold.
   */
  private void saveInFile(int noOfSales, double percentageManual, double percentageAutomatic) {
	try {
	BufferedWriter writer = new BufferedWriter(new FileWriter("stats.txt"));
    writer.write("Total Auction Sales: " + noOfSales + "	 Automatic Cars: " + percentageAutomatic
    			  + "%	 Manual Cars: " + percentageManual + "%\n");
    writer.write("Top Seller: " + this.topSeller.toString() + "\n");
	writer.close();
	} catch (IOException e) {
	  System.out.println("Could not write to file.");
	  e.printStackTrace();
	}
  }
  
  /**
   * Method. Displays the statistics file contents in the specified format.
   */
  @Override
  public String displayStatistics() {
	StringBuffer out = new StringBuffer("** Auctioneer - " + getName() + "**\n");
	try {
	  BufferedReader bf = new BufferedReader(new FileReader("stats.txt"));
	  String s = bf.readLine();
	while (s != null) {
	  out.append(s + "\n");
	  s = bf.readLine();
	}
	bf.close();
	} catch (IOException e) { 
	  System.out.println("An exception occured.");
	  e.printStackTrace();
	}
	return out.toString();
  }
}
