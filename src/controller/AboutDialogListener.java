package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AboutDialogImpl;

public class AboutDialogListener extends MenuDialogListener implements ActionListener {
	
	AboutDialogImpl md;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AboutDialogImpl md = new AboutDialogImpl("About");
	}

}
