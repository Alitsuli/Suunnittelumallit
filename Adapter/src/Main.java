
public class Main {

	public static void main(String[] args) {
		Opiskelija o = new Opiskelija();
		
		Kotitehtava t1 = new Kotitehtava("Yksinkertainen");
		Kotitehtava t2 = new Kotitehtava("Monimutkainen");
		
		Kahvi k1 = new Kahvi("Flat white");
		Kahvi k2 = new Kahvi("VanilijaLatte");
		
		o.lisaaTehtava(t1);
		o.lisaaTehtava(new KahviAdapteri(k1));
		o.lisaaTehtava(t2);
		o.lisaaTehtava(new KahviAdapteri(k2));
		
		o.teeTehtavat();
		

	}

}
