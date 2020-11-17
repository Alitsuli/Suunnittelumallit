
public class HahmoKontekstiVisitor implements HahmoVisitor{
	
	CharizardTila charizard = new CharizardTila();
	CharmanderTila charmander = new CharmanderTila();
	CharmeleonTila charmeleon = new CharmeleonTila();
	

	@Override
	public void visit(HahmoKonteksti hahmo) {
		if(hahmo.getXp() < 100) {
			hahmo.seState(charizard);
		}else if (hahmo.getXp() > 100 && hahmo.getXp() < 151) {
			hahmo.seState(charmeleon);
		}else if(hahmo.getXp() > 200) {
			hahmo.seState(charmander);
		}
		
	}

}
