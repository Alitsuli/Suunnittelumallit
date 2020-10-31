/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		
		ClockTimer timer = new ClockTimer();
		boolean timerOn = true;
		
		DigitalClock dc = new DigitalClock(timer);
		
		while(timerOn == true) {
			
			//1 sec = 1000 ms
			Thread.sleep(1000);
			timer.tick();
		}

	}

}
