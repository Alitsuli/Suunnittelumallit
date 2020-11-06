import java.util.Random;

public class KPS extends Game{
	
	
	int rp = 0;  //Rounds player
	Random rand; 
	int[] kadet; //1 = kivi, 2 = paperi, 3 = sakset
	String gameStatus = "";
	
	
	@Override
	void initializeGame() {
		// kahden henkilön peli
		playersCount = 2;
		kadet = new int[playersCount];
		rand = new Random();
		rp = 0;
	}

	@Override
	void makePlay(int player) {
		
		kadet[player] = rand.nextInt(3) + 1;
		switch(kadet[player]) {
		case 1 :
			System.out.println("Pelajaa " + (player + 1) + " sai kiven.");
			break;
		case 2 :
			System.out.println("Pelajaa " + (player + 1) + " sai paperi.");
			break;
		case 3 :
			System.out.println("Pelajaa " + (player + 1) + " sai sakset.");
			break;
		}
		
		
	}

	@Override
	boolean endOfGame() {
		
		if((kadet[0] == 1 && kadet[1]== 3)||  // kivi voittaa sakset
			(kadet[0] == 3 && kadet[1]== 2) || // sakset voittaa paperin
			(kadet[0] == 2 && kadet[1]== 1)) { // paperi voittaa kiven
			gameStatus = "Ensimmäinen pelajaa voitti";
		}else {
			gameStatus = "Toinen pelaaja voitti";
		}
		
		if(kadet[0] == kadet[1]) {
			gameStatus = "Tasa-peli";
		}
		
		rp++;
		if(rp == playersCount+1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	void printWinner() {
		System.out.println(gameStatus + "\n");
		
	}

}
