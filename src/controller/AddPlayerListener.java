package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AddPlayerDialog;

public class AddPlayerListener extends MenuDialogListener implements ActionListener {
	
	AddPlayerDialog apd;

@Override
public void actionPerformed(ActionEvent e) {
	apd = new AddPlayerDialog("Add Player");
	
	}
}
