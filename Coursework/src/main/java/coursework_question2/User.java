/**
 * User.java
 */
package coursework_question2;

import java.util.StringTokenizer;

/**
 * Defines the properties of a user.
 * 
 * @author as02795
 */
public class User {
	
  /** The user's first and last name. */
  private String fullName = null;
	
  /**
   * Constructor. Sets the 'fullName' value.
   * 
   * @param fullname
   * 		  The users first and last name, both starting with capital letters.
   * 
   * @throws IllegalArgumentException
   * 		  If the name entered is not in the correct format.
   */
  public User(String fullName) throws IllegalArgumentException {
		
    if (!fullName.matches("[A-Z]{1}[a-z]* [A-Z]{1}[a-z]*")) {
	  throw new IllegalArgumentException("This is an invalid full name.");
	}
	this.fullName = fullName;
  }
  
  /**
   * Method. Returns the user's first name.
   * 	
   * @return
   * 		  The user's first name.
   */
  public String getName() {
    StringTokenizer tokens = new StringTokenizer(this.fullName);
    return tokens.nextToken();
  }
  
  /**
   * Method. Returns the user's full name.
   * 
   * @return
   * 		  The user's full name.
   */
  @Override
  public String toString() {
    return this.fullName;
  }
}
