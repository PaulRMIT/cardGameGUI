package factory;

public class Bet {
	
	private int amount;
	private String type;
	private String suit;
	
	public Bet(int amount, String type) {
		this.amount = amount;
		this.type = type;
		this.suit = null;
	}
	
	public Bet(int amount, String type, String suit) {
		this.amount = amount;
		this.type = type;
		this.suit = suit;
	}

	public int getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public String getSuit() {
		return suit;
	}

}
