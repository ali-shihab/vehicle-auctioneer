/**
 * 
 */
package lab6_exercise3;

/**
 * @author as02795
 *
 */
public class MedalTable {
	
	private int[][] medalTable;
	
	public MedalTable() {
		this.medalTable = new int[Countries.values().length][Medals.values().length];
	}
	
	public void addMedal(Countries country, Medals medal) {
		this.medalTable[country.getIndex()][medal.getIndex()]++;
	}
	
	public int getMedals(Countries country, Medals medal) {
		return medalTable[country.getIndex()][medal.getIndex()];
	}
	
	public int getEUMedalCount() {
		int total = 0;
		for (int i = 0; i < Countries.orderedCountries().length; i++) {
			if (Countries.orderedCountries()[i].isEU()) {
				for (int j = 0; j < Medals.orderedMedals().length; j++) {
						total += getMedals(Countries.orderedCountries()[i], Medals.orderedMedals()[j]);
				}
			}
		}
		return total;
	}
	
}
