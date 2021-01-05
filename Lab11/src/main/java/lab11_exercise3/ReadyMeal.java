/**
 * 
 */
package lab11_exercise3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author as02795
 *
 */
public class ReadyMeal {

  private String name = null;
  private ProductType type = null;
  private Factory factory = null;
  private Date productionDate = null;
  private List<IItem> items = null;
  
  public ReadyMeal(String name, ProductType type, Factory factory) {
	if (name == null || type == null || factory == null) {
		throw new NullPointerException();
	}
	this.name = name;
	this.type = type;
	this.factory = factory;
	this.items = new ArrayList<IItem>();
  }
  
  public void addItem(IItem biscuit) {
	if (items.isEmpty()) {
	  this.productionDate = new Date();
	}
	this.items.add(biscuit);
  }
  
  public String getName() {
	return this.name;
  }
  
  public ProductType getType() {
	return this.type;
  }
  
  public Factory getFactory() {
	return this.factory;
  }
  
  public String printContent() {
	double weight = 0.00;
	double fat = 0.00;
	double sodium = 0.00;
	double kcal = 0;
	for (IItem item : this.items) {
	  kcal += item.getTotalCalories();
	  fat += item.getTotalFat(IngredientType.MEAT);
	  sodium += item.getTotalSodium(IngredientType.VEGETABLE);
	  weight += item.getTotalWeight();
	 }
	StringBuffer out = new StringBuffer(getType().getType() + " "
	 + getName() + " Ready Meal " + weight + " g\n" + "\nContents\n"
	 + "Calories: " + kcal + "kcal\nMeat (fat): " 
	 + fat + "g\nVegetable (sodium): "
	 + sodium + "g\n" + "\n" + getFactory().getAddress());
	
	return out.toString();
	}
}
