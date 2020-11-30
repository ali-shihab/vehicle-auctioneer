/**
 * 
 */
package lab5_exercise1;

import java.util.Arrays;

/**
 * @author as02795
 *
 */
public class RainfallYear {
	
	private int year;
	private double[] rainfallMonths;
	
	public RainfallYear(int year) {
		
		this.year = year;
		this.rainfallMonths = new double[12];
	}
	
	public double calculateMeanRainfall() {
		
		double sum = 0;
		for (int i = 0 ; i < rainfallMonths.length ; i++) {
			sum += rainfallMonths[i];
		}
		double average = sum/12;
		return average;
	}

	
	
	public double calculateHighestRainfall() {
		
		double max = rainfallMonths[0];
		for (int i = 1; i < 12 ; i++) {
			if (max < rainfallMonths[i]) {
				max = rainfallMonths[i];
			}
		}
		return max;
	}
	
	public void enterData(double[] rainfall) {
		rainfallMonths = rainfall;
	}
	
	public double getRainfallMonth(String month) {
		double selection = 0;
		
		switch (month) {
		
		case "JANUARY": 
			selection = rainfallMonths[0];
			break;
			
		case "FEBRUARY":
			selection = rainfallMonths[1];
			break;
			
		case "MARCH": 
			selection = rainfallMonths[2];
			break;
			
		case "APRIL": 
			selection = rainfallMonths[3];
			break;
			
		case "MAY": 
			selection = rainfallMonths[4];
			break;
			
		case "JUNE":
			selection =  rainfallMonths[5];
			break;
			
		case "JULY": 
			selection =  rainfallMonths[6];
			break;
			
		case "AUGUST": 
			selection = rainfallMonths[7];
			break;
			
		case "SEPTEMBER": 
			selection = rainfallMonths[8];
			break;
			
		case "OCTOBER":
			selection = rainfallMonths[9];
			break;
			
		case "NOVEMBER": 
			selection = rainfallMonths[10];
			break;
			
		case "DECEMBER":
			selection = rainfallMonths[11];
			break;
			
		default:
			System.out.println("No such month");
		}
		return selection;
	}
	
	public int getYear() {
		return this.year;
	}
}
