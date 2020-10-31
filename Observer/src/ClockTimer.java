import java.util.Observable;

/**
 * 
 */

/**
 * @author ali_r
 *
 */

/*
 * This class represents an observable object, or "data" in the model-view paradigm. 
 * It can be subclassed to represent an object that the application wants to have observed.
 */
public class ClockTimer extends Observable{
	//muuttujat
	private int hour, minute, second;
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	void tick() {
		
		second++;
		if(second >= 60) {
			second = 0;
			minute++;
		}if (minute > 60) {
			minute = 0;
			hour++;
		}
		
		setChanged();
		notifyObservers();
	}

}
