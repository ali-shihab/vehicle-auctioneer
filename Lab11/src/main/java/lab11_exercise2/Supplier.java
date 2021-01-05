/**
 * 
 */
package lab11_exercise2;

/**
 * @author as02795
 *
 */
public class Supplier {

  private String name = null;
  private String number = null;
  
  public Supplier(String name, String number) {
	if (number == null) {
		throw new NullPointerException();
	} else if (!number.matches("[0]{1}[0-9]{6,10}")){
		throw new IllegalArgumentException();
	}
	this.name = name;
	this.number = number;
  }
  
  public String getName() {
	return this.name;
  }
  
  public String getPhone() {
	return this.number;
  }
}
