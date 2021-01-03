/**
 * 
 */
package exercise2;

/**
 * @author as02795
 *
 */
public class Food {

		private String name;
		private double amountOfSugar;
		
		public Food(String name, double amountOfSugar) {
			this.name = name;
			this.amountOfSugar = amountOfSugar;
		}
		
		public String getName() {
			return this.name;
		}
		
		public double getSugarLevel() {
			return this.amountOfSugar;
		}
}
