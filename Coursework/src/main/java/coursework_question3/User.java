/**
 * User.java
 */
package coursework_question3;

import java.util.StringTokenizer;

/**
 * Defines the properties of a user.
 * 
 * @author as02795
 */
public abstract class User {
	
  /** The user's first and last name. */
  private String fullName = null;
	
  /**
   * Parameterised constructor. Sets the 'fullName' value.
   * 
   * @param fullname
   * 		  The users first and last name, both starting with 
   * 		  capital letters.
   * 
   * @throws IllegalArgumentException
   * 		  If the name entered is not in the correct format.
   */
  public User(String fullName) throws IllegalArgumentException {
	super();	
    if (!fullName.matches("[A-Z]{1}[a-z]* [A-Z]{1}[a-z]*")) {
	  throw new IllegalArgumentException("This is an invalid full name.");
	}
	this.fullName = fullName;
  }
  
  /**
   * Default constructor.
   */
  public User() {
	super();
  }
  
  /**
   * Method. Returns user's full name.
   * 
   * @return
   * 		  the user's full name.
   */
  public String getName() {
  	// TODO Auto-generated method stub
	StringTokenizer tokens = new StringTokenizer(this.fullName);
	String name = tokens.nextToken();
	return name;
  }
  
  /**
   * Abstract Method.
   * 
   * @return
   * 		  Return a string.
   */
  public String toString() {
	return this.fullName;
  }
}
