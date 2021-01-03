/**
 * 
 */
package lab8_exercise2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author as02795
 *
 */
public class PersonTracker {
	
	private List<Person> peopleList;
	
	public PersonTracker() {
		peopleList = new ArrayList<Person>();
	}
	
	public String displayList() {
		StringBuffer out = new StringBuffer();
		for (Person person: peopleList) {
			out.append(person.toString() + "\n");
		}
		return out.toString();
	}
	
	public void readTextFile(String filename) {
		BufferedReader buffer = null;
		
		try {
			FileReader in = new FileReader(filename);
			
			buffer = new BufferedReader(in);
			
			String line = buffer.readLine();
			
			while (line != null) {
				breakLine(line);
				line = buffer.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Cannot read the file");
			e.printStackTrace();
			
		} finally {
			
			try {
				buffer.close();
				
			} catch (IOException e) {
				System.out.println("Cannot close the file");
				e.printStackTrace();
			}
		}
	}
	
	private void breakLine(String line) {
		StringTokenizer tokens = new StringTokenizer(line);
		
		String fn = null;
		String sn = null;
		int age = 0;
		
		fn = tokens.nextToken();
		sn = tokens.nextToken();
		age = Integer.valueOf(tokens.nextToken());
		addPerson(fn, sn, age);
	}
	
	private void addPerson(String forename, String surname, int age) {

			Person person = new Person(forename, surname, age);
			this.peopleList.add(person);
	}

}

