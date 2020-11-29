package lab4;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example2 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Add the code here
		int[] houses;
		houses = new int[3];
		
		houses[0] = 3;
		houses[1] = 0;
		houses[2] = 4;
		
		int numberBottles = 0;
		for(int i = 0; i < houses.length; i++) {
			System.out.println("How many bottles in house " + (i + 1) + " is " + houses[i]);
			numberBottles += houses[i];
		}
		
		System.out.println("Number of total milk bottles = " + numberBottles);
		
		for(int house : houses) {
			System.out.println("How many bottles in house is " + house);
		}
		
	}
}
