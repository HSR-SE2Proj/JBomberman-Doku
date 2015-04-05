package view;

import javax.swing.JFrame;
import domain.client.GameClient;
import java.awt.Dimension;

public class GameFrame extends JFrame {
	
	public GameFrame(GameClient game) {
		setTitle("JBomberman");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Keyboard keyboard = new Keyboard();
		addKeyListener(keyboard);
		
		GamePanel panel = new GamePanel(new Dimension(832, 832), game);
		add(panel);
		
		setResizable(false);
		pack();
	}
}
