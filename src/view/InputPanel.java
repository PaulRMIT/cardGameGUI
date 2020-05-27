package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
	
	private JTextField textField;
	
	public InputPanel(String name, int fieldLength) {
		super();
		setLayout(new GridLayout(0, 2));
		JLabel label = new JLabel(name);
		this.textField = new JTextField(fieldLength);
		add(label);
		add(textField);
	}
	
	public String getText() {
		return this.textField.getText();
	}

}
