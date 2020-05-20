package view;

import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class GameMenuItemImpl extends JMenuItem {
	
	public GameMenuItemImpl(String name, int key) {
		super(name);
		setMnemonic(key);
	}

}
