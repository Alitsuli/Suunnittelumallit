package Pokemon;

public class HahmoKonteksti implements HahmoState{
	
	private HahmoState state;

	public HahmoState getState() {
		return state;
	}

	public void setState(HahmoState state) {
		this.state = state;
	}
	
	public void hyokkaa() {
		this.state.hyokkaa();
	}
	
	public void puolusta() {
		this.state.puolusta();
	}
	public void syo() {
		this.state.syo();
	}
	

}
