package LaiteOsat;
/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Verkkokortti implements Osat{
	
	int hinta = 20;
	
	public int haeHinta() {
		return this.hinta;
	}
	
	public void lisaaOsa(Osat osa) {
		System.out.println("Ei voi lisätä osia verkkokortiin");
		throw new RuntimeException();
	}


}
