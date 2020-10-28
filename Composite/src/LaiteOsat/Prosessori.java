package LaiteOsat;
/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Prosessori implements Osat{
	
	int hinta = 300;
	
	public int haeHinta() {
		return this.hinta;
	}
	
	public void lisaaOsa(Osat osa) {
		System.out.println("Ei voi lisätä osia prosessoriin");
		throw new RuntimeException();
	}

}
