
public class Kotitehtava implements IKotitehtava{
	private String nimi;
	
	public Kotitehtava(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public void teeTehtava() {
		System.out.println(nimi + " kotiteht�v� on tehty.");
	}

}
