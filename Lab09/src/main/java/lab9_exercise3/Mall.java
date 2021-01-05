/**
 * 
 */
package lab9_exercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author as02795
 *
 */
public class Mall {

  private Map<Integer, Shop> shops = null;
  
  public Mall () {
	  this.shops = new HashMap<Integer, Shop>();
  }
  
  public void addShop(Integer number, Shop shop) {
	  if (shop == null) {
		  throw new NullPointerException();
	  }
	  this.shops.put(number, shop);
  }
  
  public String displayAllShops() {
	  StringBuffer out = new StringBuffer();
	  for (Integer number : this.shops.keySet()) {
		out.append(number + " : " + this.shops.get(number).displayCatalogue());
	  }
	  return out.toString();
  }
}
