import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


	   /**
	    * Test method
	    */
		/*
	   public static void main(final String[] arguments) {
	        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
	        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

	        image1.displayImage(); // loading necessary
	        image1.displayImage(); // loading unnecessary
	        image2.displayImage(); // loading necessary
	        image2.displayImage(); // loading unnecessary
	        image1.displayImage(); // loading unnecessary
	    }*/
	
	  public static void main(String[] args) {
		  Random rand = new Random();
		  List<Image> kuvat = new ArrayList<Image>();
		  
		  for(int i= 0; i < 20; ++i) {
			  Image img = new ProxyImage("Image"+i);
			  kuvat.add(img);
		  }
		  
		  for(Image img : kuvat) {
			  img.showData();
		  }
		  
		  for(int i=0; i < 50; ++i) {
			  kuvat.get(rand.nextInt(kuvat.size())).displayImage();
		  }
	  }

}
