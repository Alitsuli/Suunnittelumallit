import java.util.Random;

public class Tuomari {
	String nimi;

	public Tuomari(String nimi) {
		this.nimi = nimi;
	}

	Random rand = new Random();

	public void annaPisteet(Makihyppaaja hyppaaja, int pituus) {
		int pisteet = pituus / 5 + rand.nextInt();
		System.out.println("Tuomari " + nimi + " antaa " + pisteet + " pistett‰ hypp‰‰j‰lle " + hyppaaja.getName());
	}
}
