package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.StorePlayerListener;
import model.GameEngine;


@SuppressWarnings("serial")
public class AddPlayerDialog extends MenuDialog {
	
	private InputPanel playerName;
	private InputPanel id;
	private InputPanel points;
	
	
	public AddPlayerDialog(String name, GameEngine ge) {
		
		setTitle(name);
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		
		//name panel
		this.playerName = new InputPanel("Name: ", 20);
		
		//id panel
		this.id = new InputPanel("Id ( max 10 ch): ", 10);
		
		//points panel
		this.points = new InputPanel("Points: ", 10);
		
		contentPanel.add(playerName);
		contentPanel.add(id);
		contentPanel.add(points);
		
		//button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		buttonPanel.add(Box.createHorizontalGlue());
		
		JButton b = new JButton("OK");
		buttonPanel.add(b);
		b.addActionListener(new StorePlayerListener(this, ge));
		
		Container contentPane = getContentPane();
		contentPane.add(contentPanel, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.PAGE_END);
		pack();
		setVisible(true);
	}

	public String getPlayerName() {
		return playerName.getText();
	}

	public String getPlayerId() {
		return id.getText();
	}

	public String getPoints() {
		return points.getText();
	}

}
