
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HahmoKontekstiVisitor visitor = new HahmoKontekstiVisitor();
		HahmoKonteksti h1 = new HahmoKonteksti(visitor);
		HahmoKonteksti h2 = new HahmoKonteksti(visitor);
		
		System.out.println("Hahmo 1:");
		h1.hyokkaa();
		h1.puolusta();
		h1.hyokkaa();
		h1.syo();
		h1.hyokkaa();
		h1.hyokkaa();
		h1.puolusta();
		h1.syo();
		
		
		System.out.println("\nHahmo 2:");
		h2.hyokkaa();
		h2.hyokkaa();
		h2.syo();
		h2.hyokkaa();
		h2.puolusta();
		h2.syo();

	}

}
