
public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		
		ArvaajaThread a1 = new ArvaajaThread(arvuuttaja, "1. Arvaaja");
		
		a1.start();
	}

}
