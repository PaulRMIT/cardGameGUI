package view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BetDetailPanel extends JPanel {
	
	public BetDetailPanel(String bet) {
		
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add (new JLabel(bet));
		
	}
}
