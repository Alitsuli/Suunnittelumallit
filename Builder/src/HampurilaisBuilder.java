
public abstract class HampurilaisBuilder {
	protected Hampurilainen h;
	
	public Hampurilainen getHampurilainen() {
		return h;
	}
	
	public void createNewHampurilainen() {
		h = new Hampurilainen();
	}
	
	//build
	public abstract void bSampyla();
	public abstract void bSinappi();
	public abstract void bKetsuppi();
	public abstract void bKurkkumajoneesi();
	public abstract void bJuusto();
	public abstract void bPihvi();




}
