import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList();

		lista.add("yksi");
		lista.add("kaksi");
		lista.add("kolme");
		lista.add("nelj‰");
		lista.add("viisi");
		lista.add("kuusi");

		Iterator i = lista.iterator();

		// s‰ikeill‰ on jaettu iteraattori eli lista k‰yd‰‰n vain kerran l‰pi
		Saie s1 = new Saie(i, "S‰ie 1");
		Saie s2 = new Saie(i, "S‰ie 2");

		System.out.println("S‰ikeill‰ on sama iteraattori: ");
		s1.start();
		s2.start();

		try {
			s1.join();
			s2.join();
		} catch (Exception e) {

		}

		// Molemilla on omat iteraattorit eli molemmat k‰yv‰t listan l‰pi
		System.out.println("\nS‰ikeill‰ on omat iteraattorit:");

		Iterator i1 = lista.iterator();
		Iterator i2 = lista.iterator();

		s1 = new Saie(i1, "S‰ie 1");
		s2 = new Saie(i2, "S‰ie 2");

		s1.start();
		s2.start();

		try {
			s1.join();
			s2.join();
		} catch (Exception e) {

		}

		// ei voi lis‰t‰ kesken iteroinnin
		i = lista.iterator();
		while (i.hasNext()) {
			String nextString = (String) i.next();
			if (nextString.equals("kaksi")) {
				// lista.add("lis‰t‰‰n kesken iteroinnin");
			}
		}

		// remove testaus
		System.out.println("\nRemove tetaus: ");
		i = lista.iterator();
		while (i.hasNext()) {
			String nextString = (String) i.next();
			System.out.println(nextString);
			if (nextString.equals("kaksi")) {
				i.remove();
			}
		}
		System.out.println("Removen j‰lkeen: ");
		i = lista.iterator();
		while (i.hasNext()) {
			String nextString = (String) i.next();
			System.out.println(nextString);
			if (nextString.equals("kaksi")) {
				i.remove();
			}
		}
		// remove poista sen elemtin joka juuri iteroidaan.

	}

}
