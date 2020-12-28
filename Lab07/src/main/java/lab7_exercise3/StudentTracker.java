/**
 * 
 */
package lab7_exercise3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author as02795
 *
 */
public class StudentTracker {

		private List<Student> studentList;
		private Map<Integer, String> moduleList;
		
		public StudentTracker() {
			studentList = new ArrayList();
			moduleList = new HashMap();
		}
		
		public String printStudents() {
			StringBuffer output = new StringBuffer();
			
			for (Student student : this.studentList) {
				output.append(student.getName() + "(" + student.getUrn() + ")\n");
			}
			return output.toString();
		}
		
		public void addStudent(Student student, List<Module> moduleList) {
			this.studentList.add(student);
			
			for (Module module: moduleList) {
				student.addModuleList(module);
			}
		}
		
		private void initialiseMap() {
			for (Student student : this.studentList) {
				this.moduleList.put(student.getUrn(), student.printModules());
			}
		}
			
		public String printModules(int urn) {
			initialiseMap();
			StringBuffer result = new StringBuffer();
			result.append("URN 23456 is enrolled in:\n");
			result.append(this.moduleList.get(urn));
			result.deleteCharAt(result.length() - 1);
			return result.toString();
		}
}
		

