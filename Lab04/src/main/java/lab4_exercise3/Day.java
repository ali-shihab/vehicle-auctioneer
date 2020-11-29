/**
 * 
 */
package lab4_exercise3;



/**
 * @author as02795
 *
 */
public class Day {

		private String name;
		private Session[] sessions;
		
		public Day(String name) {
			this.name = name;
			this.sessions = new Session[4];
		}
		
		public void setSession(int index, String moduleName, int startTime, int endTime) {
			sessions[index] = new Session(moduleName, startTime, endTime);
		}
		
		@Override
		public String toString() {
			String sessionDisplay = "";
			String totalDisplay = "";
			for (Session session : sessions) {
				if (session != null) {
					sessionDisplay = session.getSessionName() + ": " + session.getStartTime() + " - " + session.getEndTime() + "\n";
					totalDisplay += sessionDisplay;
				}
			}
			
			return totalDisplay ;
		}

		public void display() {
			System.out.println(name +"\n" + toString());
		}
		
		public String getName() {
			return name;
		}
}
