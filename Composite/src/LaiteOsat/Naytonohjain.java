package LaiteOsat;
/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Naytonohjain implements Osat{
	
	int hinta = 400;
	
	public int haeHinta() {
		return this.hinta;
	}
	
	public void lisaaOsa(Osat osa) {
		System.out.println("Ei voi lis�t� osia n�yt�nohjaimeen");
		throw new RuntimeException();
	}

}
