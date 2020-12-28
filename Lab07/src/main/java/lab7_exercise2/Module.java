/**
 * 
 */
package lab7_exercise2;

/**
 * @author as02795
 *
 */
public class Module {

		private String name;
		private String regExp = "[A-Z]{3}[0-9]{4}";
		
		public Module(String name) {
			this.name = name;
			
		}
		
		public String getName() {
			String result;
			
			if (name.matches(regExp)) {
				result = this.name;
			} else {
				result = "Error";
			}
			return result;
		}
}
