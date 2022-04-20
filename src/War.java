
public class War {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		Card[] Player = new Card[26];
		Card[] Computer = new Card[26];
		
		for (int i = 0; i < 26; i++) {
			Player [i] = myDeck.getCard(i);
			Computer[i] = myDeck.getCard(i + 26);
			
		}
		
		
		
		
		int PlayerScore = 0;
		int ComputerScore = 0;
		int TieScore=0;
		int counter=0;
		
		while(counter < 26) {
			System.out.println(counter);
			if(Player[counter].value() > Computer[counter].value()) {
				PlayerScore +=1;
				System.out.println("Battle " + (counter+1) + ": Player:" + Player[counter].identifier() + "Computer: " + Computer[counter].identifier());
				System.out.println("Current Score: " + PlayerScore + " - " + ComputerScore + " - " + TieScore + " Player Won");
				
				
			}
			
			else if(Player[counter].value() < Computer[counter].value()) {
				ComputerScore += 1;
				System.out.println("Battle " + (counter+1) + ": Player:" + Player[counter].identifier() + "Computer: " + Computer[counter].identifier());
				System.out.println("Current Score: " + PlayerScore + " - " + ComputerScore + " - " + TieScore + " Computer Won");
				
				
			}
			
			else if(Player[counter].value() == Computer[counter].value()) {
				TieScore++;
				System.out.println("Battle " + (counter+1) + ": Player:" + Player[counter].identifier() + "Computer: " + Computer[counter].identifier());
				System.out.println("Current Score: " + PlayerScore + " - " + ComputerScore + " - " + TieScore + " Tie Score");
		}
			counter++;

	}
		if(PlayerScore > ComputerScore) {
			System.out.println("PLAYER HAS WON!!");
		}

		else if(PlayerScore < ComputerScore) {
			System.out.println("COMPUTER HAS WON!!");
		}
		else {
			System.out.println("IT WAS A TIE");
		}

}
}