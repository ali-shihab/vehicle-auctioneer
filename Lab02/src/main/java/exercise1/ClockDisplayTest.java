package exercise1;

public class ClockDisplayTest {
	
	public static void main(String[] args) {
		ClockDisplay clock = new ClockDisplay(true);
		
		for (int i = 0; i <1000; i++) {
			
			clock.timeTick();
			System.out.println(clock.toString());
		}
		
		// TODO Auto-generated method stub

	}

}
