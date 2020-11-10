
public class Lahiesimies extends Palkankorottaja{
	
	double valtuusraja = 0.02 ;
	
	public void prosessoriPyytaa(Palkankorotuspyynto pyynto) {
		if(pyynto.getProsenttimaara() < valtuusraja) {
			if(Math.random() * 99 +1 > 50) {
				System.out.println("Lähiesimies myöntää " + pyynto.getProsenttimaara() * 100 + "% palkankorotuksen");
			}else {
				System.out.println("Lähiesimies ei myönnä " + pyynto.getProsenttimaara() * 100 + "% palkankorotusta");
			}
		}else {
			super.prosessoriPyytaa(pyynto);
		}
	}

}
