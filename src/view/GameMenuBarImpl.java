package view;

import java.awt.event.KeyEvent;

import javax.swing.JMenuBar;

import controller.AboutDialogListener;
import controller.AddPlayerListener;
import controller.ExitListener;
import controller.MenuDialogListener;
import model.GameEngine;

@SuppressWarnings("serial")
public class GameMenuBarImpl extends JMenuBar {
	
	private GameFrameImpl frame;
	private GameEngine ge;
	
	public GameMenuBarImpl(GameFrameImpl frame, GameEngine ge){
		super();
		this.frame = frame;
		this.ge = ge;
		
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
		about.addActionListener(new AboutDialogListener());
		exit.addActionListener(new ExitListener(frame));
		addPlayer.addActionListener(new AddPlayerListener(ge));
	}

}
