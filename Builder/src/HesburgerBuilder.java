import RaakaAineet.*;

public class HesburgerBuilder extends HampurilaisBuilder{

	@Override
	public void bSampyla() {
		// TODO Auto-generated method stub
		h.lisaaOsa(new Sampyla());
	}

	@Override
	public void bSinappi() {
		// TODO Auto-generated method stub
		h.lisaaOsa(new Sinappi());
	}

	@Override
	public void bKetsuppi() {
		// TODO Auto-generated method stub
		h.lisaaOsa(new Ketsuppi());
	}

	@Override
	public void bKurkkumajoneesi() {
		// TODO Auto-generated method stub
		h.lisaaOsa(new Kurkkumajoneesi());
	}

	@Override
	public void bJuusto() {
		// TODO Auto-generated method stub
		h.lisaaOsa(new Juusto());
		
	}

	@Override
	public void bPihvi() {
		// TODO Auto-generated method stub
		h.lisaaOsa(new Pihvi());
		
	}

}
