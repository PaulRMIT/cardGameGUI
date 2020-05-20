package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GameMenuDialogImpl;

public class MenuDialogListener implements ActionListener {
	
	GameMenuDialogImpl md;

	@Override
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unused")
		GameMenuDialogImpl md = new GameMenuDialogImpl("About");
	}

}
