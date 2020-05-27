package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameEngine;
import model.PlayerImpl;
import view.AddPlayerDialog;

public class StorePlayerListener implements ActionListener {
	
	private AddPlayerDialog apd;
	private GameEngine ge;
	
	public StorePlayerListener(AddPlayerDialog apd, GameEngine ge) {
		
		this.apd = apd;
		this.ge = ge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//error handling required
		ge.addPlayer(new PlayerImpl(apd.getPlayerId(), apd.getPlayerName(), Integer.parseInt(apd.getPoints())));

	}

}
