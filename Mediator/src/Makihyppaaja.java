import java.util.Random;

public class Makihyppaaja {

	protected Mediator mediator;
	protected String nimi;

	public Makihyppaaja(Mediator mediaattori, String nimi) {
		this.mediator = mediaattori;
		this.nimi = nimi;
	}

	Random rand = new Random();

	public void hyppaa() {
		int pituus = rand.nextInt(300);
		System.out.println("M‰kihypp‰‰j‰ " + nimi + " hyppasi " + pituus);
		mediator.otaHyppyVastaan(this, pituus);
	}

	public String getName() {
		return nimi;
	}

}
