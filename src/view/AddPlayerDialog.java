package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.DialogActionListener;

@SuppressWarnings("serial")
public class AddPlayerDialog extends MenuDialog {
	
	private String name;
	
	public AddPlayerDialog(String name) {
		this.name = name;
		
		setTitle(name);
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		
		//name panel
		JPanel playerName = new JPanel();
		playerName.setLayout(new FlowLayout());
		JLabel nameLabel = new JLabel("Name (max 20 ch): ");
		JTextField nameField = new JTextField(20);
		playerName.add(nameLabel);
		playerName.add(nameField);
		
		//id panel
		JPanel id = new JPanel();
		id.setLayout(new FlowLayout());
		JLabel idLabel = new JLabel("Id ( max 10 ch): ");
		JTextField idField = new JTextField(10);
		id.add(idLabel);
		id.add(idField);
		
		//points panel
		JPanel points = new JPanel();
		id.setLayout(new FlowLayout());
		JLabel pointsLabel = new JLabel("Points: ");
		JTextField pointsField = new JTextField(10);
		points.add(pointsLabel);
		points.add(pointsField);
		
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
		
		Container contentPane = getContentPane();
		contentPane.add(contentPanel, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.PAGE_END);
		setMinimumSize(new Dimension(400, 400));
		setVisible(true);
	}

}
