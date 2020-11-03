package Pizza;

public class Smetana extends Dekoraattori {

	public Smetana(Pizza pizzaPohja) {
		super(pizzaPohja);
	}

	public double haeHinta() {
		return super.haeHinta() + 0.5;
	}

	public String haeTaytteet() {
		return super.haeTaytteet() + " smetana";
	}
}
