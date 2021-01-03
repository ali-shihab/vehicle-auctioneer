/**
 * 
 */
package lab8_exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author as02795
 *
 */
public class Counting {
	
		public Counting() {
			
		}

		public String readTextFile() {
			
			BufferedReader buffer = null;
			
			StringBuffer out = new StringBuffer();
			
			try {
				FileReader in = new FileReader("words.txt");
				
				buffer = new BufferedReader(in);
				
				String line = buffer.readLine();
				
				int count = 0;
				
				while (line != null) {
					count += 1;
					out.append(displayLine(line, count));
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
			return out.toString();
		}
		
		private String displayLine(String line, int counter) {
			return line + " : " + counter + "\n";
		}
}
