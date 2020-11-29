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
		days[index] = day;
	}
	
	public String printTimetable() {
		String timeTable ="";
		for (Day day : days) {
			timeTable += (day.getName() + "\n" + day.toString() + "\n");
		}
		
		return timeTable;
	}
}
