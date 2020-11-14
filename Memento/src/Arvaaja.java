import java.util.Random;

public class Arvaaja {
	
	Random random = new Random();
	Object memento;
	Arvuuttaja arvuuttaja;
	
	String nimi;
	int arvaukset = 0;
	
	public Arvaaja(String nimi) {
		this.nimi = nimi;
	}
	
	public void liityArvuuttajaan(Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
		memento = arvuuttaja.liityPeliin(this);
	}
	
	public boolean arvaaLuku() {
		int luku = random.nextInt(99) + 1;
		
		if(arvuuttaja.tarkista(memento, luku)) {
			arvaukset++;
			System.out.println(nimi + " arvasi oikein " + luku + "  menetetty yritys " + arvaukset);
			return true;
		} else {
			arvaukset++;
			System.out.println(nimi + " arvasi väärin " + luku);
			return false;
		}
	}

}
