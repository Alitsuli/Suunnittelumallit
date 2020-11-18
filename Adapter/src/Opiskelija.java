import java.util.ArrayList;
import java.util.List;

public class Opiskelija {
	
	private List<IKotitehtava> tehtavat = new ArrayList();
	
	public void lisaaTehtava(IKotitehtava tehtava) {
		tehtavat.add(tehtava);
	}
	
	public void teeTehtavat() {
		for(IKotitehtava t: tehtavat) {
			t.teeTehtava();
		}
	}

}
