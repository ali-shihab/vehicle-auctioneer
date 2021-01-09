/**
 * Buyer.java
 */
package coursework_question3;

import java.util.StringTokenizer;

/**
 * Defines properties and behaviour of a buyer.
 * 
 * @author as02795
 */
public class Buyer extends User {
  
  /** The buyer's age. */
  private int age = 0;
  
  /** 
   * Constructor. Calls super parametrised
   * constructor and sets field values.
   * 
   * @param name
   * 		  The name of the buyer.
   * @param age
   * 		  The age of the buyer.
   */
  public Buyer(String name, int age) {
	super(name);
	if (age < 18) {
		throw new IllegalArgumentException("Buyer too young.");
	}
	this.age = age;
  }
  
  /**
   * Method. Acccessor for buyer's age field.
   * 
   * @return
   * 		  buyer's age.
   */
  public int getAge() {
	return this.age;
  }
  
  /**
   * Method. Returns the buyer's name as "a***b",
   * where "a" is the first letter of their name,
   * and "b" is the last.
   * 
   * @return
   * 		  the buyer's name filled with 3 asterisks.
   */
  @Override
  public String toString() {
	// TODO Auto-generated method stub
	StringBuffer out = new StringBuffer(getName().charAt(0) + "***" + getName().charAt(getName().length()-1));
	return out.toString();
  }

}
