package view;

import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class GameToolBar extends JToolBar {
	
	public GameToolBar() {
		super();
		GameToolBarButton newGame = new GameToolBarButton("New Game");
		GameToolBarButton deal = new GameToolBarButton("Deal");
		GameToolBarButton score = new GameToolBarButton("Score");
		add(newGame);
		add(deal);
		add(score);
	}

}
