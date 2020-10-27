import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import vaatteet.*;

/**
 * 
 */

/**
 * @author ali_r
 *
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream("src/tehdas.properties"));
		}catch (IOException exception) {
            System.out.println("virhe properties lukemiseen");
            exception.printStackTrace();
            return;
        }
		
		String tehdas = p.getProperty("tehdas").toString();
		System.out.println(tehdas + " tehdas valittu");
		
		Set<vaate> v = new HashSet();
		AbstractFactory VT = tuottaja.haeTehdas(tehdas);
		
		v.add(VT.haeVaate("Housut"));
		v.add(VT.haeVaate("Lippis"));
		v.add(VT.haeVaate("Kengat"));
		v.add(VT.haeVaate("Farmari"));
		
		for(vaate vaate: v) {
			vaate.pue();
		}
		
		Iterator<vaate> iteraattori = v.iterator();
		System.out.println("Jasperilla on ");
		while(iteraattori.hasNext()) {
			vaate vaate = iteraattori.next();
			
			if(!iteraattori.hasNext()) {
			System.out.println(vaate.toString() + " p‰‰ll‰.");
			}else {
				System.out.println(vaate.toString() + " ja ");
			}
		}
		
		
	}

}
