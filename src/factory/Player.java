package factory;

public class Player {
	
	private String name;
	private int points;
	private Bet bet;
	
	
	public Player(String name, int points, Bet bet) {
		this.name = name;
		this.points = points;
		this.bet = bet;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public Bet getBet() {
		return bet;
	}

}
