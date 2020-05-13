package guiElements.playersPanel;

import java.awt.Color;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class GamePlayersPanelButton extends JButton {
	
	public GamePlayersPanelButton(String name) {
		super(name);
		setBackground(Color.blue);
		setForeground(Color.white);
	}

}
