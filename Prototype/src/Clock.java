
public abstract class Clock implements Cloneable {

	protected int timer = 0;

	public abstract void ticking();

	public int getTime() {
		return timer;
	}

	public void setTime(int time) {
		timer = time;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
