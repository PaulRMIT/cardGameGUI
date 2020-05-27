package view;

import java.awt.Color;

import javax.swing.JPanel;

import model.GameEngine;

@SuppressWarnings("serial")
public class GamePlayersPanel extends JPanel {
	
	public GamePlayersPanel(GameEngine ge) {
		super();
		setBackground(Color.DARK_GRAY);
		PlayerPanel player1 = new PlayerPanel(ge);
		add(player1);
	}

}
