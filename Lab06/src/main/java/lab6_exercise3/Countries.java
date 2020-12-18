/**
 * 
 */
package lab6_exercise3;

/**
 * @author as02795
 *
 */
public enum Countries {
	CANADA(1, false), CHINA(2, false), BRITAIN(0, true), FRANCE(4, true), RUSSIA(3, false);
	
	private int index;
	private boolean inEU;
	
	private Countries(int index, boolean inEU) {
		this.index = index;
		this.inEU = inEU;
	}
	
	public int getIndex() {
		return index;
	}
	
	public boolean isEU() {
		return inEU;
	}
	
	/**
	 * Method to return the countries in the correct order.
	 *
	 *@return an array of the countries in the correct order.
	 */
	public static Countries[] orderedCountries() {
		// Use the index as an array index.
		Countries[] output = new Countries[Countries.values().length];
		
		for(Countries country : Countries.values()) {
			output[country.getIndex()] = country;
			} 
		return output;
	}
	
	
}
