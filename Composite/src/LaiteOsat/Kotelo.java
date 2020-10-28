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
public class Kotelo implements Osat{

	List<Osat> o = new ArrayList();
	
	int hinta = 60;
	
	public int haeHinta() {
		int osienHinta = 0;
		
		for(Osat osa : o) {
			osienHinta += osa.haeHinta();
		}
		
		return osienHinta + this.hinta;
	}
	
	public void lisaaOsa(Osat osa) {
		o.add(osa);
	}
}
