
public class Paallikko extends Palkankorottaja{
	
	double valtuusraja = 5 / 100 ;
	
	public void prosessoriPyytaa(Palkankorotuspyynto pyynto) {
		if(pyynto.getProsenttimaara() < valtuusraja) {
			if(Math.random() * 99 +1 > 50) {
				System.out.println("P��llikk� my�nt�� " + pyynto.getProsenttimaara() * 100 + "% palkankorotuksen");
			}else {
				System.out.println("p��likk� ei my�nn� " + pyynto.getProsenttimaara() * 100 + "% palkankorotusta");
			}
		}else {
			super.prosessoriPyytaa(pyynto);
		}
	}

}
