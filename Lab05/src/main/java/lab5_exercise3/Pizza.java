/**
 * 
 */
package lab5_exercise3;

/**
 * @author as02795
 *
 */
public class Pizza {
	
	private String[] toppings;
	
	public Pizza() {
		this.toppings = new String[10];
	}
	
	public void addToppings(String[] toppings) {
		
		for (int i = 0 ; i < toppings.length ; i++) {
			
			if (this.toppings[i] != toppings[i] ) {
				this.toppings[i] = toppings[i];
			}
		}
	}
	
	public double calculateCost() {
		
		double price;
		int notNull = 0;
		for (int i = 0; i < 10; i++) {
			if (this.toppings[i] != null) {
				notNull++;
			}
		}
		switch (notNull) {
			case (1):
				price = 8.99;
				break;
			case (2):
				price = 8.99;
				break;
			case (3):
				price = 8.99;
				break;
			case (4):
				price = 8.99;
				break;
			case (5):
				price = 9.99;
				break;
			case (6):
				price = 10.99;
				break;
			case (7):
				price = 11.99;
				break;
			case (8):
				price = 12.99;
				break;
			case (9):
				price = 13.99;
				break;
			case (10):
				price = 14.99;
				break;
			default:
				price = 0.0;
				break;
				}
		return price;
	}
	
	public String printToppings() {
		String display = "";
		for (int i = 0; i < 10; i++) {

			if (this.toppings[i] != null) {
				display += this.toppings[i] + ",";
			}
		}
		return display.substring(0, display.length() - 1);
	}
}
