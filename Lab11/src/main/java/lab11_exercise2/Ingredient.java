/**
 * 
 */
package lab11_exercise2;

/**
 * @author as02795
 *
 */
public class Ingredient {

  private String name = null;
  private IngredientType type = null;
  private Supplier supplier = null;
  private double rawWeight = 0;
  private double calories = 0;
  private double fat = 0;
  private double sodium = 0;
  
  public Ingredient(String name, IngredientType type, Supplier supplier, 
		            double rawWeight, double calories, double fat, double sodium) {
	  this.name = name;
	  this.type = type;
	  this.supplier = supplier;
	  this.rawWeight = rawWeight;
	  this.calories = calories;
	  this.fat = fat;
	  this.sodium = sodium;
  }
  
  public String getName() {
	return this.name;
  }
  
  public IngredientType getType() {
	return this.type;
  }
  
  public Supplier getSupplier() {
	return this.supplier;
  }
  
  public double getRawWeight() {
	return this.rawWeight;
  }
  
  public double getCalories() {
	return this.calories;
  }
  
  public double getFat() {
	return this.fat;
  }
  
  public double getSodium() {
	return this.sodium;
  }
  
  public double getCookedWeight() {
	return this.rawWeight*0.80;
  }
}
