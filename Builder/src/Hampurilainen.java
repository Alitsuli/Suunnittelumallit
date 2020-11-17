

import java.util.ArrayList;
import java.util.List;

public class Hampurilainen {
	List<Object> osat = new ArrayList();
	
	public void lisaaOsa(Object o) {
		osat.add(o);
	}
	
	public List<Object> getOsat(){
		return osat;
	}

}
