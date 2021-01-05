/**
 * Charge.java 
 */
package lab10_exercise3;

/**
 * Defines properties of a charge.
 * 
 * @author as02795
 */
public class Charge {

  /** The service the customer was charged for. 
   * VATRate is obtained from this. 
   */
  private Service service = null;
  
  /** The amount charged for the service. */
  private double charge = 0;
  
  /**
   * Constructor. Sets the field values for the charge object.
   * 
   * @param service
   * 		  The service to be charged for.
   * @param charge
   * 		  The amount being charged.
   */
  public Charge (Service service, double charge) {
	  this.service = service;
	  this.charge = charge;
  }
  
  /**
   * Methods. Accessors for each field in the constructor.
   * 
   * @return
   * 		  The values of each field.
   */
  public Service getService() {
	  return this.service;
  }
  
  public double getCharge() {
	  return this.charge;
  }
  
  /**
   * Method. Calculates VAT charge by calling the getRate (double)
   * accessor, from the VATRate class, on the enumeration obtained 
   * from the getRate (enumeration) accessor from Service class.
   */
  public double calculateVAT() {
	  return this.charge*this.service.getRate().getRate();
  }
}
