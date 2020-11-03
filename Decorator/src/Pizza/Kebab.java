package Pizza;

public class Kebab extends Dekoraattori {

	public Kebab(Pizza pizzaPohja) {
		super(pizzaPohja);
	}

	public double haeHinta() {
		return super.haeHinta() + 1.5;
	}

	public String haeTaytteet() {
		return super.haeTaytteet() + " kebab";
	}

}
