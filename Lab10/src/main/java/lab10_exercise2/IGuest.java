/**
 * IGuest.java
 */
package lab10_exercise2;

/**
 * Interface specifying behaviour of Guest objects.
 * 
 * @author as02795
 */
public interface IGuest {

  public void addCharge(Service service, double charge);
		
  public double calculateTotalChargeWithoutVAT();
  
  public double calculateVATChargeAtRate(VATRate rate);
  
  /**
   * Method. Returns string representation of Guest,
   * showing Guest's forename, surname, address, and
   * telephone number as a string.
   * 
   * @return
   * 		  String representation of Guest.
   */
  public String toString();
}
