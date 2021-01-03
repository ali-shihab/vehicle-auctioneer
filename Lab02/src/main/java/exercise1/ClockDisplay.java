package exercise1;

import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	private int count = 0;
	private String suffix;
	private boolean clock12;
	DecimalFormat style;
	DecimalFormat style2 = new DecimalFormat("00");
	
	public ClockDisplay(boolean clock12) {
		
		this.minutes = new NumberInfo(60);
		this.clock12 = clock12;
		
		if (clock12) {
			this.hours = new NumberInfo(12);
		} else {
			this.hours = new NumberInfo(24);
		}
	}
	
	public void timeTick(){
		this.minutes.increment();
		
		if (minutes.getValue() == 0) {
			this.hours.increment();
			count++;
		}
	}
	
	@Override
	public String toString() {
		
		int hour = this.hours.getValue();
		
		if (this.clock12) {
			
			if (count % 24 > 11) {
				suffix = "pm";
			} else {
				suffix = "am";
			}
			
			if (count == 12) {
				hour += 12;
			}
			style = new DecimalFormat("#0");
			return (style.format(hour) + 
					   ":" + style2.format(this.minutes.getValue()) + suffix);
		} else {
			this.suffix = "";
			style = new DecimalFormat("00");
		}
		
		return (style.format(this.hours.getValue()) + 
		   ":" + style2.format(this.minutes.getValue()) + suffix);
	}
	
	
}
