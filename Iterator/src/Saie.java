import java.util.Iterator;

public class Saie extends Thread {

	Iterator iteraattori;
	String nimi;

	public Saie(Iterator iteraattori, String nimi) {
		this.iteraattori = iteraattori;
		this.nimi = nimi;
	}

	public void run() {
		while (iteraattori.hasNext()) {
			System.out.println("Säie " + nimi + ": " + iteraattori.next());
		}
	}

}
