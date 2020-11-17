
public class HahmoKonteksti implements HahmoState{
	
	private HahmoState state;
	private HahmoVisitor visitor;
	int xp = 0;
	
	public HahmoKonteksti(HahmoVisitor visitor) {
		this.visitor = visitor;
		visitor.visit(this);
	}
	
	public void seState(HahmoState state) {
		this.state = state;
	}
	
	public HahmoState getState() {
		return this.state;
	}
		

	@Override
	public void syo() {
		// TODO Auto-generated method stub
		this.state.syo();
		xp += 10;
		visitor.visit(this);
		
	}

	@Override
	public void puolusta() {
		// TODO Auto-generated method stub
		this.state.puolusta();
		xp += 20;
		visitor.visit(this);
		
	}

	@Override
	public void hyokkaa() {
		// TODO Auto-generated method stub
		this.state.hyokkaa();
		xp += 50;
		visitor.visit(this);
		
	}
	
	public int getXp() {
		return xp;
	}

}
