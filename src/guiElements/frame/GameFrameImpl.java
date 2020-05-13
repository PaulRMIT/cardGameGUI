package guiElements.frame;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrameImpl extends JFrame {
	
	public GameFrameImpl() {
		super("Card Game");
		setBounds(100, 100, 1280, 720);
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	}

}
