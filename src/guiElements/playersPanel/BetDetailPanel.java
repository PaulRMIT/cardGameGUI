package guiElements.playersPanel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import factory.Bet;

@SuppressWarnings("serial")
public class BetDetailPanel extends JPanel {
	
	private Bet bet;
	
	public BetDetailPanel(Bet bet) {
		super();
		this.bet = bet;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JLabel("Current Bet Amount: " + this.bet.getAmount()));
		add(new JLabel("Current Bet Type: " + this.bet.getType()));
		
		if (this.bet.getSuit() != null)
			add(new JLabel("Suit: " + this.bet.getSuit()));
	}
}
