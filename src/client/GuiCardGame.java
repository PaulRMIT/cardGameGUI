package client;

import java.awt.BorderLayout;

import guiElements.frame.GameFrameImpl;
import guiElements.handPanel.GameHandPanelImpl;
import guiElements.menubar.GameMenuBarImpl;
import guiElements.playersPanel.GamePlayersPanel;
import guiElements.statusBar.GameStatusBar;
import guiElements.toolBar.GameToolBar;

public class GuiCardGame {
	
	public static void main (String[] args) {
		GameFrameImpl gf = new GameFrameImpl();
		GameStatusBar statusBar = new GameStatusBar();
		GameMenuBarImpl menuBar = new GameMenuBarImpl(gf);
		GamePlayersPanel playersPanel = new GamePlayersPanel();
		GameHandPanelImpl playerHandPanel = new GameHandPanelImpl();
		GameToolBar toolBar = new GameToolBar();
		
		gf.add(statusBar, BorderLayout.SOUTH);
		gf.setJMenuBar(menuBar);
		gf.add(playersPanel, BorderLayout.EAST);
		gf.add(toolBar, BorderLayout.NORTH);
		gf.add(playerHandPanel, BorderLayout.CENTER);
		gf.setVisible(true);
	}

}
