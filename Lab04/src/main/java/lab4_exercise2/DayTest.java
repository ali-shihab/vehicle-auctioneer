/**
 * 
 */
package lab4_exercise2;

/**
 * @author as02795
 *
 */
public class DayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 11);
		d.setSession(1, "COM1026", 12, 13);
		d.setSession(2, "COM1031", 14, 16);
		d.setSession(3, "COM1025", 17, 18);
		d.display();
	}

}
