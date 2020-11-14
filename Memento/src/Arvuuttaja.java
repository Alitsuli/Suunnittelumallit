import java.util.Random; 

//tehtävä 11
public class Arvuuttaja {
	
	Random random = new Random();
	
	public synchronized Memento liityPeliin(Arvaaja arvaaja) {
		int luku = random.nextInt(99) + 1;
		return new Memento(luku);
	}
	
	public synchronized boolean tarkista(Object o, int arvaus) {
		Memento memento = (Memento)o;
		
		if(memento.getState() == arvaus) {
			return true;
		} else {
			return false;
		}
	}
	
}
