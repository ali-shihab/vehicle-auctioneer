package lab2;

public class ClockDisplayTest {
	
	public static void main(String[] args) {
		ClockDisplay clock = new ClockDisplay();
		
		for (int i = 0; i <100; i++) {
			
			clock.timeTick();
			System.out.println(clock.toString());
		}
		
		// TODO Auto-generated method stub

	}

}
