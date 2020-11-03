import Pizza.*;

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
		
		Pizza pitsa1 =new Kebab(new Kana(new PitsaToteutus()));
		Pizza pitsa2 =new Kebab(new Kana(new Smetana (new PitsaToteutus())));
		
        System.out.println("1. Pizza maksaa: " + pitsa1.haeHinta() +" €");
        System.out.println(pitsa1.haeTaytteet());
        
        System.out.println("2. Pizza maksaa: " + pitsa2.haeHinta() + " €");
        System.out.println(pitsa2.haeTaytteet());
	}


}
