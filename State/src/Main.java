import Pokemon.*;

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
		
		HahmoKonteksti hahmo = new HahmoKonteksti();
        HahmoState charizard = new CharizardTila();	
        HahmoState charmeleon = new CharmeleonTila();
        HahmoState charmander = new CharmanderTila();
        
        hahmo.setState(charizard);
        hahmo.hyokkaa();
        hahmo.puolusta();
        hahmo.syo();
        System.out.println("\n");
        
        hahmo.setState(charmeleon);
        hahmo.hyokkaa();
        hahmo.puolusta();
        hahmo.syo();
        System.out.println("\n");
        
        hahmo.setState(charmander);
        hahmo.hyokkaa();
        hahmo.puolusta();
        hahmo.syo();
	}

}
