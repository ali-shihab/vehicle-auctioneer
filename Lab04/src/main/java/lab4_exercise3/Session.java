/**
 * 
 */
package lab4_exercise3;

/**
 * @author as02795
 *
 */
public class Session {

		private String sessionName;
		private int startTime;
		private int endTime;
		
		public Session(String sessionName, int startTime, int endTime) {
			this.sessionName = sessionName;
			this.startTime = startTime;
			this.endTime = endTime;
		}
		
		public int getStartTime() {
			return this.startTime;
		}
		
		public int getEndTime() {
			return this.endTime;
		}
		
		public String getSessionName()
		{
			return this.sessionName;
		}
}
