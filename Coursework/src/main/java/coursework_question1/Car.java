/**
 * Car.java
 */
package coursework_question1;

import java.text.DecimalFormat;

/**
 * Defines the properties of a car that is for sale.
 * 
 * @author as02795
 */
public class Car {

  /** The car's 4 digit ID number. */	
  private int id = 0;
  
  /** The car's make and model name. */
  private String name = null;
  
  /** The car's colour. */
  private String colour = null;
  
  /** The car's minimum price to be sold for. */
  private double reservedPrice = 0.00;
  
  /** The car's the car's transmission. */
  private CarType gearbox = null;
  
  /** The car's body type. */
  private CarBody body = null;
  
  /** The number of seats in the car. */
  private int numberOfSeats = 0;
  
  /** The car's physical condition. */
  private Condition condition = null;
		
  /**
   * Constructor. Sets the value of the fields.
   * 
   * @param id
   * 		  Car ID.
   * @param name
   * 		  Car make and model name.
   * @param reservedPrice
   * 		  Minimum price for sale of the car.
   * @param condition
   * 		  Car's physical condition.
   * @param colour
   * 		  Colour of the car.
   * @param gearbox
   * 		  Car's type of transmission.
   * @param body
   * 		  Car's body type.
   * @param numberOfSeats
   * 		  Number of seats that the car has.
   * 
   * @throws IllegalArgumentException
   * 		  If any of the parameters passed are null, out of range, or not in the correct format.
   */
    public Car(int id, String name, double reservedPrice, Condition condition) throws IllegalArgumentException {		
	  if (!String.valueOf(id).matches("[0-9]{4}")) {
	    throw new IllegalArgumentException("Invalid ID number.");
   	  }
			
	  if (name == null || !name.matches("[A-Z]{1}[a-z]* [A-Z]*[a-z0-9\\s]*")) {
	    throw new IllegalArgumentException("Invalid car name.");
	  }
			
	  if (reservedPrice < 0) {
		throw new IllegalArgumentException("Reserved price cannot be negative.");
	  }
			
	  if (condition == null) {
		throw new IllegalArgumentException("Condition cannot be null.");
	  }
	  this.id = id;
   	  this.name = name;
   	  this.reservedPrice = reservedPrice;
   	  this.condition = condition;
   	  this.colour = null;
   	  this.gearbox = null;
   	  this.body = null;
   	  this.numberOfSeats = 0;
	}
		
    /** 
     * Method. Displays the details of the car as a specification.
     * 
     * @return
     * 			The car specification.	
     */
	public String displayCarSpecification() {
		
	  StringBuffer out = new StringBuffer();
	  DecimalFormat style = new DecimalFormat("0.00");
	  out.append(this.id + " - " + this.name + " (£" + style.format(this.reservedPrice) + ")\n"
	    + "\t Type: " + this.gearbox + "\n" + "\t Style: " + this.body + "\n" + "\t Colour: " 
		+ this.colour + "\n" + "\t No. of Seats: " + this.numberOfSeats 
		+ "\n" + "\t Condition: " + this.condition);
	  return out.toString();
	}
	
    /** 
     * Methods. Accessor and Mutator methods for each field in the constructor.
     * 
     * @param
     * 			Parameters required to mutate the value in the constructor fields.
     * @return
     * 			The value in the constructor fields.	
     */	
	public CarBody getBodyStyle() {
	  return this.body;
	}
		
	public void setBody(CarBody body) {
	  this.body = body;
	}
		
	public String getColour() {
	  return this.colour;
	}
		
	public void setColour(String colour) {
	  this.colour = colour;
	}
		
	public CarType getGearbox() {
	  return this.gearbox;
	}
		
	public void setGearbox(CarType type) {
	  this.gearbox = type;
	}
		
	public int getID() {
	  return this.id;
	}
		
	public void setID(int id) {
	  this.id = id;
	}
		
	public String getName() {
	  return this.name;
	}
		
	public void setName(String name) {
	  this.name = name;
	}
		
	public int getNumberOfSeats() {
	  return this.numberOfSeats;
	}
	
	public void setNumberOfSeats(int seats) {
	  this.numberOfSeats = seats;
	}
		
	public double getPrice() {
	  return this.reservedPrice;
	}

    /** 
     * Method. Returns ID and name of the car as a string.
     * 
     * @return
     * 			The car id and name..	
     */
	@Override
	public String toString() {
	  return this.id + " - " + this.name;
	}
		
		
}
