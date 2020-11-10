
public class Paallikko extends Palkankorottaja{
	
	double valtuusraja = 5 / 100 ;
	
	public void prosessoriPyytaa(Palkankorotuspyynto pyynto) {
		if(pyynto.getProsenttimaara() < valtuusraja) {
			if(Math.random() * 99 +1 > 50) {
				System.out.println("Päällikkö myöntää " + pyynto.getProsenttimaara() * 100 + "% palkankorotuksen");
			}else {
				System.out.println("päälikkö ei myönnä " + pyynto.getProsenttimaara() * 100 + "% palkankorotusta");
			}
		}else {
			super.prosessoriPyytaa(pyynto);
		}
	}

}
