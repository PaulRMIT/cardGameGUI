package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GameFrameImpl;

public class ExitListener implements ActionListener {
	
	private GameFrameImpl frame;
	public ExitListener(GameFrameImpl frame) {
		
		super();
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
	}

}
