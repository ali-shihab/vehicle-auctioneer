/**
 * 
 */
package lab6_exercise2;

/**
 * @author as02795
 *
 */
public class Halfbacks {
	Player[] halfbacks;
	
	public Halfbacks() {
		this.halfbacks = new Player[2];
	}
	
	public void assignHalfback(Player player) {
		switch (player.getPosition()) {
		case SCRUMHALF:
			halfbacks[0] = player;
			break;
		case FLYHALF:
			halfbacks[1] = player;
			break;
		default:
			break;
		}
	}
	public String displayElements() {
		String contents = "";
		
		for (int i = 0; i < 2; i++) {
			if (halfbacks[i] == null) {
					contents = i + " - " + "\n";
			} else if (halfbacks[i].getPosition() == RugbyPosition.SCRUMHALF || halfbacks[i].getPosition() == RugbyPosition.FLYHALF) {
					contents += i + " - " + halfbacks[i].getName() + " " + halfbacks[i].getPosition() + "\n";
			} else {
					contents = i + " -" + "\n";
			}
		}
		return contents;
	}
	
	/**
	*Really bad way of extracting detail from an internally managed
	*array. We should never ask for the array index as this is
	*implementation detail.
	*
	*@param number index into array - DO NOT DO THIS
	*@return the name of the player at the specified array index.
	*/
	public String getPlayerBad(int number) { 
		String result = null;
		if (number == 0) {
			result = this.halfbacks[0].getName();
		} 
		if(number == 1) { 
			result = this.halfbacks[1].getName();
		} 
		return result;
	}
	
	public String getPlayer(RugbyPosition position) {
		
		String name = "";
		switch (position.getPositionNumber()) {
		case 9:
			name = halfbacks[0].getName();
			break;
		case 10:
			name = halfbacks[1].getName();
			break;
		default:
			name = "null";
			break;
		}
		return name;
	}
	
	
}
