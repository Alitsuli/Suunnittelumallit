
public class Toimitusjohtaja extends Palkankorottaja{
	
	public void prosessoriPyytaa(Palkankorotuspyynto pyynto) {
		if(Math.random() * 99 +1 > 50){
			System.out.println("Toimitusjohtaja myöntää " + pyynto.getProsenttimaara() * 100 + "% palkankortuksen");
		}else {
			System.out.println("toimitusjohtaja ei myönnä " + pyynto.getProsenttimaara() * 100 + "% palkankorotusta");
		}
	}

}
