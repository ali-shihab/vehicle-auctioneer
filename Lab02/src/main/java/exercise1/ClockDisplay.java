package exercise1;

import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	public String suffix;
	private boolean morning;
	public static DecimalFormat style = new DecimalFormat();
	public static DecimalFormat style1 = new DecimalFormat("00");
	
	public ClockDisplay(boolean clock12) {
		
		this.minutes = new NumberInfo(60);
		
		if (this.morning == true) {
			this.hours = new NumberInfo(12);
		} else {
			this.hours = new NumberInfo(24);
		}
	}
	public void timeTick(){
		this.minutes.increment();
		
		if (minutes.getValue() == 0) {
			this.hours.increment();
		}
	}
	
	@Override
	public String toString() {
		if (hours.getValue()<10) {
			style = new DecimalFormat ("0");
		} else {
			style = new DecimalFormat ("00");
		}
		if (morning == true) {
			this.suffix = "am";
		} else if (morning == false) {
			this.suffix = "";
		}
		return ( style.format(this.hours.getValue()) + 
		   ":" + style1.format(this.minutes.getValue()) + suffix.toString() );
	}
	
	
}
