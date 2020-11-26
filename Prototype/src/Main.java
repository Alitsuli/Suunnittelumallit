public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Clock digitalClock1 = new DigitalClock();
		Clock digitalClock2 = (Clock) digitalClock1.clone();

		System.out.println("Kello 1 aika: " + digitalClock1.getTime());
		System.out.println("Kello 2 aika: " + digitalClock2.getTime());

		digitalClock1.setTime(50);
		System.out.println("Kello 1 aika: " + digitalClock1.getTime());
		System.out.println("Kello 2 aika: " + digitalClock2.getTime());

		digitalClock2.setTime(60);
		System.out.println("Kello 1 aika: " + digitalClock1.getTime());
		System.out.println("Kello 2 aika: " + digitalClock2.getTime());

	}

}