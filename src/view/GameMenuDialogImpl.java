package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import controller.DialogActionListener;

@SuppressWarnings("serial")
public class GameMenuDialogImpl extends JDialog {
	
	public GameMenuDialogImpl(String title) {
		super();
		setTitle(title);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		JButton b = new JButton("OK");
		b.addActionListener(new DialogActionListener(this));
		add(new JLabel("Name: Paul Cooper"));
		//TODO make this appear on a new line
		add(new JLabel("Student Number: s3755840"));
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		add(new JLabel("Time: " + dt.format(format)));
		add(new JLabel("Yep I did everything, don't hate it please :)"));
		
		add(b);
		setSize(300,300);
		setVisible(true);
	}
}
