import LaiteOsat.*;
/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Osat kotelo = new Kotelo();
		Osat emolevy = new Emolevy();
		Osat muistipiiri = new Muistipiiri();
		Osat naytonohjain = new Naytonohjain();
		Osat prosessori = new Prosessori();
		Osat verkkokortti = new Verkkokortti();
		
		/*
		kotelo.lisaaOsa(emolevy);
		emolevy.lisaaOsa(muistipiiri);
		emolevy.lisaaOsa(prosessori);
		emolevy.lisaaOsa(naytonohjain);
		emolevy.lisaaOsa(verkkokortti);*/
		
		
		
		//muistipiiri.lisaaOsa(emolevy);
		kotelo.lisaaOsa(muistipiiri);
		
		System.out.println("Tietokoneen hinta on " + kotelo.haeHinta());
		

	}

}
