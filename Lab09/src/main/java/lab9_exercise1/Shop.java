/**
 * 
 */
package lab9_exercise1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author as02795
 *
 */
public class Shop {
	
  private List<IItem> items = null;
  
  public Shop() {
	  this.items = new ArrayList<IItem>();
  }
  
  public void addItem(IItem item) {
	  if (item == null) {
		  throw new NullPointerException();
	  }
	  this.items.add(item);
  }
  
  public String displayCatalogue() {
	  DecimalFormat format = new DecimalFormat("0.00");
	  StringBuffer out = new StringBuffer("Shop Catalogue\n" + "\n" + "Item\t\tPrice\tSale Price");
	  for (IItem item : this.items) {
		  out.append("\n" + item.getName() + "\t£" + String.valueOf(format.format(item.getPrice())) + "\t£" + String.valueOf(format.format(item.calculateSalePrice()))) ;
	  }
	  out.append("\n");
	  return out.toString();
  }
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		IItem m = new MP3Player(160);
		IItem t = new TV(400, 40);
		shop.addItem(m);
		shop.addItem(t);
		System.out.println(shop.displayCatalogue());
	}

}
