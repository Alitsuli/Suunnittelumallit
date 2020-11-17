import RaakaAineet.HampurilaisOsa;

public class Main {

	public static void main(String[] args) {
		Tarjoilija tar = new Tarjoilija();
		
		HampurilaisBuilder mcBuilder = new McDonaldsBuilder();
		HampurilaisBuilder heseBuilder = new HesburgerBuilder();
		
		tar.setBuilder(mcBuilder);
		tar.constructHamburger();
		
		Hampurilainen hampurilainen = tar.getHampurilainen();
		
		System.out.println("Hampurilaisessa on ");
		for(Object o : hampurilainen.getOsat()) {
			System.out.println((String)o);
		}
		
		tar.setBuilder(heseBuilder);
		tar.constructHamburger();
		
		hampurilainen = tar.getHampurilainen();
		
		System.out.println("\nHampurilaisessa on ");
		for(Object o : hampurilainen.getOsat()) {
			HampurilaisOsa osa = (HampurilaisOsa)o;
			System.out.println(osa.getNimi());
		}

	}

}
