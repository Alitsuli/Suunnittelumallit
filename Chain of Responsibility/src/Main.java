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
		
		Lahiesimies esimies = new Lahiesimies();
		Paallikko paalikko = new Paallikko();
		Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
		
		esimies.setSeuraaja(paalikko);
		paalikko.setSeuraaja(toimitusjohtaja);
		
		Palkankorotuspyynto p1 = new Palkankorotuspyynto();
		Palkankorotuspyynto p2 = new Palkankorotuspyynto();
		Palkankorotuspyynto p3 = new Palkankorotuspyynto();
		
		p1.setProsenttimaara(0.01);
		p2.setProsenttimaara(0.03);
		p3.setProsenttimaara(2);
		
		esimies.prosessoriPyytaa(p1);
		esimies.prosessoriPyytaa(p2);
		esimies.prosessoriPyytaa(p3);
		
		

	}

}
