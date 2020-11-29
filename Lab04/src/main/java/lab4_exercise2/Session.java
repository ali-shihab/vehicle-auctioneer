/**
 * 
 */
package lab4_exercise2;

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
			return startTime;
		}
		
		public int getEndTime() {
			return endTime;
		}
		
		public String getSessionName()
		{
			return sessionName;
		}
}
