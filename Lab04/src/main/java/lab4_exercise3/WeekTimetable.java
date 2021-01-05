/**
 * 
 */
package lab4_exercise3;

/**
 * @author as02795
 *
 */
public class WeekTimetable {
	private Day[] days;
	
	public WeekTimetable() {
		this.days = new Day[5];
	}
	
	public void addDailySessions(int index, Day day) {
		this.days[index] = day;
	}
	
	public String printTimetable() {
		String timeTable ="";
		for (Day day : this.days) {
			timeTable += (day.getName() + "\n" + day.toString() + "\n");
		}
		
		return timeTable;
	}
}
