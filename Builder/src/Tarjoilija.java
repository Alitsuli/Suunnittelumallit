
public class Tarjoilija {
	private HampurilaisBuilder builder;
	
	public void setBuilder(HampurilaisBuilder hb) {
		builder = hb;
	}
	
	public Hampurilainen getHampurilainen() {
		return builder.getHampurilainen();
	}
	
	public void constructHamburger() {
		builder.createNewHampurilainen();
		builder.bSampyla();
		builder.bSinappi();
		builder.bKetsuppi();
		builder.bJuusto();
		builder.bPihvi();
	}

}
