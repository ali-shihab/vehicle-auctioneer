package lab5;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example2 {

	public static void main(String[] args) {
		// Add your code here
		int result;
		
		for (int j = -1; j <= 4; j++) {
			
			result = j;
			
			String series = "";
			
			for (int i = 0 ; i <=3 ; i++) {
				result += 2;
				series += " " + result;
			}
			
			System.out.println(series);
		}
	}
}
