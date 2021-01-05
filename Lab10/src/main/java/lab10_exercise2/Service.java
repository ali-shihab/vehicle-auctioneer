/**
 * .Service.java
 */
package lab10_exercise2;

/**
 * @author as02795
 *
 */
public class Service {

  private String code = null;
  private String name = null;
  private VATRate rate = null;
  private double standardCharge = 0;
  
  public Service(String code, String name, VATRate rate, double standardCharge) {
	  if (name == null || code == null) {
		  throw new NullPointerException();
	  } else if (!code.matches("[A-Z]{4}[0-9]{4}") || standardCharge < 0) {
		  throw new IllegalArgumentException();
	  }
	  this.code = code;
	  this.name = name;
	  this.rate = rate;
	  this.standardCharge = standardCharge;
  }
  
  public String getCode() {
	  return this.code;
  }
  
  public String getName() {
	  return this.name;
  }
  
  public VATRate getRate() {
	  return this.rate;
  }
  
  public double getStandardCharge() {
	  return this.standardCharge;
  }
}
