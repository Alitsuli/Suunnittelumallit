
public class Kahvi implements IKahvi{
	private String nimi;
	
	public Kahvi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public void juoKahvi() {
		System.out.println(nimi + " kahvi on juotu.");
	}

}
