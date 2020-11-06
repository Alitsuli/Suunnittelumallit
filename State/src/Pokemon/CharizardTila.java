package Pokemon;

public class CharizardTila implements HahmoState{

	@Override
	public void puolusta() {
        System.out.println("Charizard puolusta!");
		
	}

	@Override
	public void hyokkaa() {
        System.out.println("Charizard hyökkää!");
		
	}

	@Override
	public void syo() {
        System.out.println("Charizard syö!");
		
	}

}
