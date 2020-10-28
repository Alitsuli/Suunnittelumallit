package LaiteOsat;
/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author ali_r
 *
 */
public class Muistipiiri implements Osat{
		
	int hinta = 50;
	
	public int haeHinta() {
		return this.hinta;
	}
	
	public void lisaaOsa(Osat osa) {
		System.out.println("Ei voi lis‰t‰ osia muistiin, yritt‰‰ lis‰t‰ osan kotelon");
		throw new RuntimeException();
	}
}
