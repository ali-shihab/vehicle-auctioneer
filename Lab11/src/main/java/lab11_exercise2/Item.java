package lab11_exercise2;

import java.util.ArrayList;
import java.util.List;

public class Item implements IItem {

  private List<Ingredient> ingredients = null;
  
  public Item() {
	  this.ingredients = new ArrayList<Ingredient>();
  }
  
  @Override
  public void addIngredient(Ingredient ingredient) {
  	// TODO Auto-generated method stub
	this.ingredients.add(ingredient);
  }

  @Override
  public double getTotalWeight() {
  	// TODO Auto-generated method stub
	double sum = 0.00;
	for (Ingredient ingredient : this.ingredients) {
		sum += ingredient.getCookedWeight();
	}
	return sum;
  }

  @Override
  public double getTotalCalories() {
  	// TODO Auto-generated method stub
	double sum = 0.00;
	for (Ingredient ingredient : this.ingredients) {
		sum += ingredient.getCalories();
	}
	return sum;
  }

  @Override
  public double getTotalFat(IngredientType type) {
  	// TODO Auto-generated method stub
	double sum = 0.00;
    for (Ingredient ingredient : this.ingredients) {
    	if (ingredient.getType() == type) {
    		sum += ingredient.getFat();    		
    	}
	}
	return sum;
  }

  @Override
  public double getTotalSodium(IngredientType type) {
  	// TODO Auto-generated method stub
	double sum = 0.00;
	for (Ingredient ingredient : this.ingredients) {
	    if (ingredient.getType() == type) {
	    	sum += ingredient.getSodium();    		
	    }
	}
	return sum;
  }

}
