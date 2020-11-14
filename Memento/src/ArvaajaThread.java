
public class ArvaajaThread  extends Thread{
	
	Arvaaja arvaaja;
	
	public ArvaajaThread(Arvuuttaja arvuuttaja, String nimi) {
		arvaaja = new Arvaaja(nimi);
		arvaaja.liityArvuuttajaan(arvuuttaja);
	}
	
	public void run() {
		boolean arvattuoikein = false;
		while(!arvattuoikein) {
			
			arvattuoikein = arvaaja.arvaaLuku();
			
			try {
				Thread.sleep(250);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
