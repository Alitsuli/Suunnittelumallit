
public class KahviAdapteri implements IKotitehtava{
	private Kahvi kahvi;
	
	public KahviAdapteri(Kahvi kahvi) {
		this.kahvi = kahvi;
	}

	@Override
	public void teeTehtava() {
		kahvi.juoKahvi();
	}

}
