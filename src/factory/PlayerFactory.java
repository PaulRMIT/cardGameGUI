package factory;

public class PlayerFactory {
	
	private static final Player[] PLAYER_PLACEHOLDERS =
			new Player[] { 
					new Player("James Bond", 100000, new Bet(15000, "Suit Bet", "Hearts")),
					new Player("Kenny Rogers", 200, new Bet(200, "Score Bet"))
			};
	
	public static final int NUM_PLAYERS() {
		return PLAYER_PLACEHOLDERS.length;
	}
	
	public static Player getPlayer(int i) {
		return PLAYER_PLACEHOLDERS[i];
	}
	

}
