/**
 * 
 */
package exercise2;

/**
 * @author as02795
 *
 */
public class MealTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food main = new Food("BLT Sandwich", 4.7);
		Food dessert = new Food("Dark Chocolate", 48);
		Meal meal = new Meal (main, dessert);
		System.out.println(meal.toString());
		System.out.println("Total amount of sugar: " + meal.calculateTotalSugarLevel() + "g");
	}

}
