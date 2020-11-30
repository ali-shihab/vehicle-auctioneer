package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A simple class that uses String literals and their built-in methods
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {
	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		String s1 = "good";
		System.out.println(s1);

		String s2 = "morning";
		String s3 = s1 + " " + s2;
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s2.length() + s3.length());

		// Get the character at a particular position
		// Add your code here

		boolean start = false;
		// Creating a string literal
		String exercise = "COM1027";

		// Creating a string using parameterised String constructor.
		String exercise2 = new String("COM1027");

		// Add your code here
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		
		System.out.println(exercise.startsWith("COM"));
		System.out.println(exercise2.startsWith("COM"));
		
		// Does exercise equal exercise2? (.equals)
		// Add your code here
		
		if (exercise.contentEquals(exercise2)) {
			System.out.println("The two strings are equal");
		} else {
			System.out.println("The two strings are NOT equal");
		}
		

		// Does exercise equal exercise2? (==)
		// Add your code here

		if (exercise == exercise2) {
			System.out.println("exercise equals exercise2");
		} else {
			System.out.println("exercise does NOT equal exercise2");
		}
		
		String exercise3 = "COM1027";
		
		if (exercise == exercise3) {
			System.out.println("exercise equals exercise3");
		} else {
			System.out.println("exercise does NOT equal exercise3");
		}
	}
}