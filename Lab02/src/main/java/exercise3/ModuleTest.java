/**
 * 
 */
package exercise3;

/**
 * @author as02795
 *
 */
public class ModuleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assessment labs = new Assessment("Labs", 90.0);
		Assessment coursework = new Assessment("Coursework", 72.2);
		Module module = new Module(labs, coursework);
		System.out.println(module.toString());
	}

}
