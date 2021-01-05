/**
 * VATRate.java
 */
package lab10_exercise3;

/**
 * VAT enumeration.
 * 
 * @author as02795
 */
public enum VATRate {

  /** 3 tiers of VAT rate. */
  ZERO(0.00), LOW(0.05), STANDARD(0.175);
	
  private double rate = 0.00;
  
  /**
   * Constructor for rate field of the VAT rate tiers.
   * 
   * @param rate
   */
  private VATRate(double rate) {
	 this.rate = rate;
  }
  
  /**
   * Method. Returns the decimal rate of the specified VAT enumeration.
   * @return
   */
  public double getRate() {
	  return this.rate;
  }
}
