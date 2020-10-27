/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Tuottaja {
	
	public static AbstractFactory haeTehdas (String merkki) {
		switch(merkki){
			case "adidas":
				return new AdidasTehdas();
				
			case "boss":
				return new BossTehdas();
				
			default:
				return null;
		}
	}

}
