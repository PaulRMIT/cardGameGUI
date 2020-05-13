package guiElements.playersPanel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PlayerPanel extends JPanel {
	
	public PlayerPanel() {
		
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		add(new PlayerDetailPanel());
	}
	
	

}
