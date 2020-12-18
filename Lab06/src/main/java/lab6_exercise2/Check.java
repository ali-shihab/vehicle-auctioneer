/**
 * 
 */
package lab6_exercise2;

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
		Player player1 = new Player("Rhys Priestland", RugbyPosition.FLYHALF);
		Player player2 = new Player("Mike Phillips", RugbyPosition.SCRUMHALF);
		Halfbacks halfbacks = new Halfbacks();
		halfbacks.assignHalfback(player1);
		halfbacks.assignHalfback(player2);
		System.out.println(halfbacks.displayElements());
		
		// Not a good way of extracting the player...
		System.out.println(halfbacks.getPlayerBad(1));
		
		System.out.println(halfbacks.getPlayer(RugbyPosition.SCRUMHALF));
	}

}
