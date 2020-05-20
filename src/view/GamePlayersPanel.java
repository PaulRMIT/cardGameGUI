package view;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePlayersPanel extends JPanel {
	
	public GamePlayersPanel() {
		super();
		setBackground(Color.DARK_GRAY);
		PlayerPanel player1 = new PlayerPanel();
		add(player1);
	}

}
