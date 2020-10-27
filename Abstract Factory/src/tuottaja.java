/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class tuottaja {
	public static AbstractFactory haeTehdas (String merkki) {
		switch(merkki){
			case "Adidas":
				return new AdidasTehdas();
				
			case "Boss":
				return new BossTehdas();
				
			default:
				return null;
		}
	}

}
