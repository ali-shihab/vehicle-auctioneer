package lab4;

import java.util.List;
import java.util.ArrayList;
/**
 * A simple class to introduce ArrayLists
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {

	// Add a field
	private List<String> namesList;
	// Add a default constructor
	public Example4() {
		this.namesList = new ArrayList<String>();
	}

	public void addNames() {
		// Initialise the array list
		namesList.add("Helen");
		namesList.add("Stella");
		
		

	}

	public String displayNames() {
		// Loop through the array list
		String list = "";
		for (String name : namesList) {
			list += name;
		}
		return list;
	}
}
