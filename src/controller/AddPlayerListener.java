package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameEngine;
import view.AddPlayerDialog;

public class AddPlayerListener extends MenuDialogListener implements ActionListener {
	
	private GameEngine ge;
	
	
	public AddPlayerListener(GameEngine ge) {
		this.ge = ge;
	}

@Override
public void actionPerformed(ActionEvent e) {
	AddPlayerDialog apd = new AddPlayerDialog("Add Player", ge);
	
	}
}
