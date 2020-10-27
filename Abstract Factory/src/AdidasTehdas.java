import vaatteet.*;

public class AdidasTehdas extends AbstractFactory{

	public Vaate haeVaate(String vaateTyyppi) {
		switch (vaateTyyppi) {
		case "Housut":
			return new AdiFarmari();
		case "Keng�t":
			return new AdiKengat();
		case "Lippis":
			return new AdiLippis();
		case "Paita":
			return new AdiPaita();
			default:
				return null;
		}
		
	}

}
