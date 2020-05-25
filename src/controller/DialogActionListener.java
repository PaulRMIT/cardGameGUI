package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AboutDialogImpl;

public class DialogActionListener implements ActionListener {
	
	private AboutDialogImpl gmd;
	
	public DialogActionListener(AboutDialogImpl gmd) {
		
		this.gmd = gmd;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gmd.setVisible(false);
		
	}

}
