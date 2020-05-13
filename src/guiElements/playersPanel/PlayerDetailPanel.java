package guiElements.playersPanel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import factory.Player;
import factory.PlayerFactory;

@SuppressWarnings("serial")
public class PlayerDetailPanel extends JPanel {
	
	public PlayerDetailPanel() {
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		Player player = null;
		for(int i = 0; i < PlayerFactory.NUM_PLAYERS(); i++) {
			add(new JLabel("Player " + (i + 1)));
			player = PlayerFactory.getPlayer(i);
			add(new JLabel("Name: " + player.getName()));
			add(new JLabel("Points: " + player.getPoints()));
			add(new BetDetailPanel(player.getBet()));
			add(new JSeparator());
		}
	}

}
