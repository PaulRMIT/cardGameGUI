package view;

import javax.swing.JMenu;

@SuppressWarnings("serial")
public class GameMenuImpl extends JMenu {
	
	public GameMenuImpl(String name, int key) {
		super(name);
		setMnemonic(key);
	}

}
