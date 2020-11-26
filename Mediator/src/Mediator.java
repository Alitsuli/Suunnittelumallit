import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {

	List<Makihyppaaja> hyppaajat = new ArrayList();
	List<Tuomari> tuomarit = new ArrayList();

	@Override
	public void otaHyppyVastaan(Makihyppaaja hyppaaja, int pituus) {
		pisteytaHyppy(hyppaaja, pituus);

	}

	@Override
	public void pisteytaHyppy(Makihyppaaja hyppaaja, int pituus) {
		for (Tuomari t : tuomarit) {
			t.annaPisteet(hyppaaja, pituus);
		}

	}

	@Override
	public void lisaaHyppaaja(Makihyppaaja hyppaaja) {
		hyppaajat.add(hyppaaja);

	}

	@Override
	public void lisaaTuomari(Tuomari tuomari) {
		tuomarit.add(tuomari);

	}

}
