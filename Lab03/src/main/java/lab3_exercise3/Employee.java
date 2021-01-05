/**
 * 
 */
package lab3_exercise3;

/**
 * @author as02795
 *
 */
public class Employee {

	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	
	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}
	
	public String getForename() {
		return this.forename;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public double getSalary() {
		return this.salary.getSalary();
	}
	
	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}
	
	public String displayEmployeeName() {
		return getSurname() + ", " + getForename();
	}
	
	public int getId() {
		return this.id;
	}
	
	private String eligibleForBonus(AnnualSalary salary) {
		if (salary.getSalary() > 40000){
			return "is eligible for bonus.";
		} else {
			return "is not eligible for bonus.";
		}
	}

	@Override
	public String toString() {
		return displayEmployeeName() + " (" + getId() + "): " + getPositionName() + " at £" + salary.getSalary() 
		+ " (£" + salary.calculateTax() + " tax) " + "and " + eligibleForBonus(salary);
	}
	
	
}
