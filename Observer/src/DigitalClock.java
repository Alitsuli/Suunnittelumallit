import java.util.Observable;
import java.util.Observer;

/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class DigitalClock implements Observer{
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if(o == timer) {
			draw();
		}
	}

	private void draw() {
		int h = timer.getHour();
		int m= timer.getMinute();
		int s = timer.getSecond();
		
		System.out.println("Digital Clock: "+ h + "."+ m + "." + s);
		
	}

}
