/**
 * 
 */
package exercise2;

/**
 * @author as02795
 *
 */
public class Meal {
	
	private Food mainCourse;
	private Food dessert;
	
	public Meal(Food mainFood, Food dessertFood) {
		this.mainCourse = mainFood;
		this.dessert = dessertFood;
	}
	
	public double calculateTotalSugarLevel() {
		return mainCourse.getSugarLevel() + dessert.getSugarLevel();
	}

	@Override
	public String toString() {
		return "Meal [mainCourse = " + this.mainCourse.getName() + ", dessert = " + this.dessert.getName() + "]";
	}
}
