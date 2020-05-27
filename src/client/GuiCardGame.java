package client;

import java.awt.BorderLayout;

import model.GameEngine;
import model.GameEngineImpl;
import view.ConsoleLoggerCallback;
import view.GameCallback;
import view.GameFrameImpl;
import view.GameHandPanelImpl;
import view.GameMenuBarImpl;
import view.GamePlayersPanel;
import view.GameStatusBar;
import view.GameToolBar;

public class GuiCardGame {

	
	public static void main (String[] args) {
		GameEngine ge = new GameEngineImpl();
		GameCallback callback = new ConsoleLoggerCallback(ge);
		ge.registerCallback(callback);
		
		GameFrameImpl gf = new GameFrameImpl();
		GameStatusBar statusBar = new GameStatusBar();
		GameMenuBarImpl menuBar = new GameMenuBarImpl(gf, ge);
		GamePlayersPanel playersPanel = new GamePlayersPanel(ge);
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
