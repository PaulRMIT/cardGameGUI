package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GameMenuDialogImpl;

public class DialogActionListener implements ActionListener {
	
	private GameMenuDialogImpl gmd;
	
	public DialogActionListener(GameMenuDialogImpl gmd) {
		
		this.gmd = gmd;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gmd.setVisible(false);
		
	}

}