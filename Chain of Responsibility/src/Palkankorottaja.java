/**
 * 
 */

/**
 * @author ali_r
 *
 */
public abstract class Palkankorottaja {
	
	private Palkankorottaja seuraaja;
	
	public void setSeuraaja(Palkankorottaja seuraaja) {
		this.seuraaja = seuraaja;
	}
	
	public void prosessoriPyytaa(Palkankorotuspyynto pyynto) {
		if(seuraaja != null) {
			seuraaja.prosessoriPyytaa(pyynto);
		}
	}
	

}
