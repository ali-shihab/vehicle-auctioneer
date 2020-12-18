/**
 * 
 */
package lab6_exercise3;

/**
 * @author as02795
 *
 */
public enum Medals {
	BRONZE(0), SILVER(1), GOLD(2);
	
	private int index;
	
	private Medals(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	/**
	 *Method to return the medals in the correct order for the table.
	 *
	 *@return an array of the medals in the correct order.
	 *
	 */
	public static Medals[] orderedMedals() {
		// Use the index as an array index.
		Medals[] medals = new Medals[Medals.values().length];
		
		for(Medals medal : Medals.values()) {
			medals[medal.getIndex()] = medal;
		}
		return medals;
	}
	
}
