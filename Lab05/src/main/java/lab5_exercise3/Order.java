/**
 * 
 */
package lab5_exercise3;

import java.util.List;
import java.util.ArrayList;
/**
 * @author as02795
 *
 */
public class Order {
	
	private List<Pizza> pizzas;
	private Customer customer;
	
	public Order(Customer customer) {
		this.customer = customer;
		this.pizzas = new ArrayList<Pizza>();
	}
	
	public void addPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}
	
	public double calculateTotal() {
		
		double total = 0;
		
		for (Pizza pizza : pizzas) {
			total += pizza.calculateCost();
		}
		return total;
	}
	
	public String printReceipt() {
		return "Customer: " + customer.toString() + "\n" + "Number of Pizzas: " + pizzas.size() + "\n" + "Total Cost: " + calculateTotal();
	}
}
