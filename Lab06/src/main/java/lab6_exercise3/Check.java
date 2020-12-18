/**
 * 
 */
package lab6_exercise3;

/**
 * @author as02795
 *
 */
public class Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedalTable m = new MedalTable();
		m.addMedal(Countries.CANADA, Medals.SILVER );
		m.addMedal(Countries.CANADA, Medals.SILVER );
		m.addMedal(Countries.CHINA, Medals.BRONZE);
		m.addMedal(Countries.CHINA, Medals.SILVER);
		m.addMedal(Countries.CHINA, Medals.SILVER);
		m.addMedal(Countries.CHINA, Medals.GOLD);
		m.addMedal(Countries.CHINA, Medals.GOLD);
		m.addMedal(Countries.CHINA, Medals.GOLD);
		m.addMedal(Countries.BRITAIN, Medals.GOLD);
		m.addMedal(Countries.BRITAIN, Medals.GOLD);
		m.addMedal(Countries.BRITAIN, Medals.GOLD);
		m.addMedal(Countries.BRITAIN, Medals.GOLD);
		m.addMedal(Countries.BRITAIN, Medals.GOLD);
		m.addMedal(Countries.FRANCE, Medals.BRONZE);
		m.addMedal(Countries.RUSSIA, Medals.BRONZE);
		m.addMedal(Countries.RUSSIA, Medals.BRONZE);
		m.addMedal(Countries.RUSSIA, Medals.BRONZE);
		m.addMedal(Countries.RUSSIA, Medals.GOLD);
		System.out.println(m.toString());
		System.out.println();
		
	}

}
