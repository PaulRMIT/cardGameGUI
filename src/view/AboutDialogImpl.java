package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.DialogActionListener;

@SuppressWarnings("serial")
public class AboutDialogImpl extends MenuDialog {
	
	public AboutDialogImpl(String title) {
		super();
		setTitle(title);
		
		//content panel
		JPanel aboutPanel = new JPanel();
		aboutPanel.setLayout(new BoxLayout(aboutPanel, BoxLayout.PAGE_AXIS));
		aboutPanel.add(new JLabel("Name: Paul Cooper"));
		aboutPanel.add(new JLabel("Student Number: s3755840"));
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		aboutPanel.add(new JLabel("Time: " + dt.format(format)));
		aboutPanel.add(new JLabel("Yep I did everything, don't hate it please :)"));
		
		//button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		buttonPanel.add(Box.createHorizontalGlue());
		
		JButton b = new JButton("OK");
		b.addActionListener(new DialogActionListener(this));
		buttonPanel.add(b);
		
		Container contentPane = getContentPane();
		contentPane.add(aboutPanel, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.PAGE_END);
		setMinimumSize(new Dimension(300, 200));
		setVisible(true);
	}
}
