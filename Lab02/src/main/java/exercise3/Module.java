/**
 * 
 */
package exercise3;

import java.text.DecimalFormat;

/**
 * @author as02795
 *
 */
public class Module {

		Assessment assessment1;
		Assessment assessment2;
		
		public Module(Assessment assessment1, Assessment assessment2) {
			this.assessment1 = assessment1;
			this.assessment2 = assessment2;
		}
		
		public double calculateAverage() {
			return Math.round((assessment1.getMark()*0.2 + assessment2.getMark()*0.8)*10.0)/10.0;
		}

		@Override
		public String toString() {
			return "COM1027 Average = " + calculateAverage() + "% " + "[Labs(20%) = " + assessment1.getMark() + "% ,Coursework(80%) = " + assessment2.getMark() + "% ]";
		}
		
		
}
