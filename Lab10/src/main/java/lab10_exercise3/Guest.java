/**
 * 
 */
package lab10_exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author as02795
 *
 */
public class Guest implements IGuest {

  /** Guest's forename. */
  private String forename = null;
  
  /** Guest's surname. */
  private String surname = null;
  
  /** Guest's address */
  private String address = null;
  
  /** Guest's phone number */
  private String telephone = null;
  
  /** Guest's list of service charges */
  private List<Charge> charges = null;
  
  /**
   * Constructor. Sets field values.
   * 
   * @param forename
   * 		  Guest's forename.
   * 
   * @param surname
   * 		  Guest's surname.
   * @param address
   * 		  Guest's address.
   * @param telephone
   * 		  Guest's telephone number.
   * @param charges
   * 		  Guest's list of service charges.
   */
  public Guest(String forename, String surname, String address, String telephone) {
	this.forename = forename;
	this.surname = surname;
	this.address = address;
	this.telephone = telephone;
	this.charges = new ArrayList<Charge>();
  }
  
  /**
   * Methods. Returns the values of the constructor fields.
   * 
   * @return
   * 		  forename, surename, address, telephone, charges.
   */
  public String getForename() {
	return this.forename;
  }
  
  public String getSurname() {
	return this.surname;
  }
  
  public String getAddress() {
	return this.address;
  }
  
  public String getTelephone() {
	return this.telephone;
  }
  
  public List<Charge> getCharges() {
	return this.charges;
  }
  
  /**
   * Method implemented from the IGuest interface. 
   * Adds charges that the Guest incurs to the list of charges.
   * 
   * @param charge
   * 		  The charge to be added to the list.
   * @param service
   * 		  The service to be charged for.
   */
  @Override
  public void addCharge(Service service, double charge) {
    // TODO Auto-generated method stub
	if (service == null) {
      throw new NullPointerException();
	} else if (charge < 0) {
	  throw new IllegalArgumentException();
	} else {
	  this.charges.add(new Charge(service, charge));
	}
  }

    /**
     * Method. Implementation of the same method from IGuest 
     * interface. Loops through each pre-VAT charge and adds 
     * it on to sum.
     * 
     * @return
     * 		  The sum of pre-VAT charges.
     */
	@Override
	public double calculateTotalChargeWithoutVAT() {
	  // TODO Auto-generated method stub
	  double sum = 0.00;
	  for (Charge charge : this.charges) {
	    sum +=charge.getCharge();
	  }
		return sum;
	}

	/**
	 * Method. Implementation of the same method from IGuest 
	 * interface. Loops through each pre-VAT charge and adds 
	 * it on to sum, then multiplies by the specified VAT
	 * rate.
	 * 
	 * @return
	 * 		  The sum of VAT charges.
	 */
	@Override
	public double calculateVATChargeAtRate(VATRate rate) {
	  // TODO Auto-generated method stub
	  if (rate == null) {
		  throw new NullPointerException();
	  }
	  double sum = 0.00;
	  for (Charge charge : this.charges) {
	    sum +=charge.getCharge();
	  }
	  sum *= rate.getRate();
	  return sum;
	}

	/**
	 * Method. Implementation of IGuest interface toString method.
	 * 
	 * @return
	 * 		   Guest details as string.
	 */
	@Override
	public String toString() {
		return this.forename + " " + this.surname + ", " + this.address + ", " + this.telephone;
	}
}
