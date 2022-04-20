import java.util.Random;

class Deck{
	private Card[] deck = new Card[52];
	
	public Deck() {
		int cardCounter = 0;
		String strSuit;
		String strRank;
		
		for (int suitIndex=0; suitIndex<4; suitIndex++) {
			if(suitIndex==0) strSuit="Clubs";
			else if (suitIndex==1) strSuit="Diamonds";
			else if (suitIndex==1)strSuit="Hearts";
			else strSuit="Spades";
			
			for (int rankIndex=0; rankIndex<13; rankIndex++) {
				switch(rankIndex) {
				case 1:
					strRank="A";
				case 13:
					strRank="K";
				case 12:
					strRank="Q";
				case 11:
					strRank="J";
				break;
				default: 
					strRank = Integer.toString(rankIndex);
				break;
					
					
				}
				
				deck [cardCounter] = new Card(strSuit, strRank);
				deck[cardCounter] = new Card(strRank, strSuit);
				cardCounter++;
				
				
			}
		}
		
		shuffle();
		shuffle();
		shuffle();
		shuffle();
		shuffle();
		cut();
	}
	
	public Card[] getDeck() {
		return deck;
	}
		
	public Card getCard(int index) {
		return deck[index];
	}
	
	public void shuffle() {
		
		Random rng = new Random();
				int lcv = this.deck.length;
		
		while (lcv>1)
		{
			lcv--;
			int index=rng.nextInt(lcv+1);
			Card temp = deck[lcv];
			deck[lcv]=deck[index];
			deck[index]=temp;
			
		}
		
	}
	
	public void cut() {
		
	}
	
	public Card deal() {
		Card tempCard = new Card ("0", "0");
		
		return tempCard;
	}
}