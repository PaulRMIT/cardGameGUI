package view;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import model.GameEngine;

@SuppressWarnings("serial")
public class PlayerPanel extends JPanel {
	
	public PlayerPanel(GameEngine ge) {
		
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		add(new PlayerDetailPanel(ge));
	}
	
	

}
