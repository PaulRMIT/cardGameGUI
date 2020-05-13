package guiElements.menubar;

import java.awt.event.KeyEvent;

import javax.swing.JMenuBar;

import guiElements.listeners.MenuActionListener;

@SuppressWarnings("serial")
public class GameMenuBarImpl extends JMenuBar {
	
	public GameMenuBarImpl() {
		super();
		GameMenuImpl file = new GameMenuImpl("File", KeyEvent.VK_F);
		GameMenuImpl players = new GameMenuImpl("Players", KeyEvent.VK_P);
		GameMenuItemImpl exit = new GameMenuItemImpl("Exit", KeyEvent.VK_E);
		GameMenuItemImpl about = new GameMenuItemImpl("About", KeyEvent.VK_A);
		GameMenuItemImpl addPlayer = new GameMenuItemImpl("Add Player", KeyEvent.VK_A);
		GameMenuItemImpl removePlayer = new GameMenuItemImpl("Remove Player", KeyEvent.VK_R);
		file.add(about);
		file.add(exit);
		players.add(addPlayer);
		players.add(removePlayer);
		add(file);
		add(players);
		about.addActionListener(new MenuActionListener());
	}

}