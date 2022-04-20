
 class Card {

	 private String rank;
	 private String suit;
	 private int value;
	 
	 public Card(String rank, String suit) {
		 this.rank = rank;
		 this.suit = suit;
	}
	 
	 public String rank() {
		 return rank;
	 }
	 
	 public String suit() {
		 return suit;
	 }
	 
	 public String identifier() {
		 if (rank == "A")
		 {
			 return "Ace of " + suit;
		 }
		 else
		 {
			 return rank+ " of " + suit;
		 }
	 }
	 
	 public int value() {
		 switch(rank) {
		 case "A":
			 return 1;
		 case "K":
			 return 13;
		 case "Q":
			 return 12;
		 case "J":
			 return 11;
		default:
			return Integer.parseInt(this.rank);
		 }
	 }

}
