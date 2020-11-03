package Pizza;

public class Kana extends Dekoraattori{

	public Kana(Pizza pizzaPohja) {
		super(pizzaPohja);
	}

	public double haeHinta() {
		return super.haeHinta() + 1.5;
	}

	public String haeTaytteet() {
		return super.haeTaytteet() + " kana";
	}

}
