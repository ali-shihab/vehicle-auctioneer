/**
 * 
 */
package lab3_exercise2;

/**
 * @author as02795
 *
 */
public class AnnualSalary {
	
	private double salary;
	private final double basicThreshold = 12509;
	private final double higherThreshold = 50009;
	private double tax;
	
	public AnnualSalary() {
		
	}
	
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double calculateTax() {
		
		if (salary < higherThreshold && salary > basicThreshold) {
			this.tax = (salary - basicThreshold)*0.2;
		} else if (salary > higherThreshold) {
			this.tax = (higherThreshold - basicThreshold)*0.2 + (salary - higherThreshold)*0.4;
		} else {
			this.tax = 0;
		}
		
		return this.tax;
		
	}
}
