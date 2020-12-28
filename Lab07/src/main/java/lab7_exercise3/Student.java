/**
 * 
 */
package lab7_exercise3;

import java.util.List;
import java.util.ArrayList;

/**
 * @author as02795
 *
 */
public class Student {

		private String name;
		private int urn;
		private List<Module> moduleList;
		private String regExp = "[A-Z]{1}[a-z]* [A-Z]{1}[a-z]*";
		
		public Student(String name, int urn) {
			this.name = name;
			this.urn = urn;
			this.moduleList = new ArrayList<Module>();
		}
		
		public void addModuleList(Module module) {
			if (moduleList.contains(module)) {
				System.out.println("Already exists.");
			} else {
				this.moduleList.add(module);
			}
		}
		
		public int getUrn() {
			return this.urn;
		}
		
		public String getName() {
			String result;
			
			if (this.name.matches(regExp)) {
			result = this.name;
			} else {
			result = "Error";
			}
			return result;
		}
		
		public String printModules() {
			StringBuffer output = new StringBuffer();
			
			for (Module module: moduleList) {
				output.append(module.getName() + ", ");
			}
			
			output.deleteCharAt(output.length() - 2);
			return output.toString();
		}
}
