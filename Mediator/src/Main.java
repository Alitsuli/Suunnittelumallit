
public class Main {

	public static void main(String[] args) {
		Mediator m = new Mediator();

		Makihyppaaja h1 = new Makihyppaaja(m, "Antti Aalto");
		Makihyppaaja h2 = new Makihyppaaja(m, "Matti Nykänen");

		Tuomari t1 = new Tuomari("Tuomari 1");
		Tuomari t2 = new Tuomari("Tuomari 2");
		Tuomari t3 = new Tuomari("Tuomari 3");
		Tuomari t4 = new Tuomari("Tuomari 4");
		Tuomari t5 = new Tuomari("Tuomari 5");

		m.lisaaHyppaaja(h1);
		m.lisaaHyppaaja(h2);

		m.lisaaTuomari(t1);
		m.lisaaTuomari(t2);
		m.lisaaTuomari(t3);
		m.lisaaTuomari(t4);
		m.lisaaTuomari(t5);

		h1.hyppaa();
		h2.hyppaa();

	}

}
