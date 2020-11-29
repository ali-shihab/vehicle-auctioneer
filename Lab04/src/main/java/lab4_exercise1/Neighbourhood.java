/**
 * 
 */
package lab4_exercise1;

import java.util.List;

/**
 * @author as02795
 *
 */
public class Neighbourhood {
	House[] houses = new House[3];
	
	public Neighbourhood() {
		houses[0] = new House(3,4);
		houses[1] = new House(5,1);
		houses[2] = new House(7,2);
	}
	
	public int calculateTotal() {
		int total = 0;
		for (House house : houses) {
			total += house.getNumberBottles();
		}
		return total;
	}
	
	public String displayArray() {
		String display = "";
		for (House house: houses) {
			String noOfBottles = "Number of bottles in House number " + house.getNumberOfHouse() + " is " + house.getNumberBottles() + "\n";
			display += noOfBottles;
		}
		return display + "Total number of bottles to be delivered: " + calculateTotal();
	}
	
	public House getHouses(int index) {
		return houses[index];
	}
	
	public void setHouses(int index, int numberOfHouse, int numberBottles) {
		this.houses[index] = new House (numberOfHouse, numberBottles);
	}
}
