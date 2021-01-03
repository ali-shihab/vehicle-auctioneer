/**
 * 
 */
package exercise3;

/**
 * @author as02795
 *
 */
public class Assessment {

		private String name;
		private int maximum = 100;
		private double mark;
		
		public Assessment(String name, double mark) {
			this.name = name;
			this.mark = mark;
		}
		
		public double getMark() {
			return this.mark;
		}
		
		public int getMaximum() {
			return maximum;
		}
		
		public String getName() {
			return this.name;
		}
}
