package view;

import java.util.Collection;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import model.GameEngine;
import model.Player;

@SuppressWarnings("serial")
public class PlayerDetailPanel extends JPanel {
	
	private Collection<Player> players;
	
	public PlayerDetailPanel(GameEngine ge) {
		super();
		this.players = ge.getAllPlayers();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for(Player player : players) {
			add(new JLabel("Name: " + player.getName()));
			add(new JLabel("Points: " + player.getPoints()));
			add(new BetDetailPanel(player.getBet().toString()));
			add(new JSeparator());
		}
	}

}
