import vaatteet.*;

public class BossTehdas extends AbstractFactory{

	public vaate haevaate(String vaateTyyppi) {
		switch (vaateTyyppi) {
		case "Housut":
			return new BossFarmari();
		case "Kengät":
			return new BossKengat();
		case "Lippis":
			return new BossLippis();
		case "Paita":
			return new BossPaita();
			default:
				return null;
		}
		
	}

}
