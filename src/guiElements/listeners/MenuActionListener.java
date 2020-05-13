package guiElements.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import guiElements.menubar.GameMenuDialogImpl;

public class MenuActionListener implements ActionListener {
	
	GameMenuDialogImpl md;

	@Override
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unused")
		GameMenuDialogImpl md = new GameMenuDialogImpl("About");
	}

}
