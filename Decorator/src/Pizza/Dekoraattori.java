package Pizza;

abstract class Dekoraattori implements Pizza{

	private final Pizza pizzaPohja;

	public Dekoraattori(Pizza pizzaPohja) {
		this.pizzaPohja = pizzaPohja;
	}

	public double haeHinta() {
		return pizzaPohja.haeHinta();
	}

	public String haeTaytteet() {
		return pizzaPohja.haeTaytteet();
	}

}
