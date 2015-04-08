package view;

import javax.swing.JFrame;

import java.util.Observable;
import java.util.Observer;
import game.*;
import application.*;

public class GameFrame extends JFrame implements Observer {
	
	private controller cont;

	public GameFrame(controller cont) {
		this.cont = cont;
		Game game = new Game();
		game.addObserver(this);
		game.playGame();
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		String message = (String) arg1;
		System.out.println("got a message");
		if(message.compareTo("finished") == 0) {
			cont.gameFinished();
			this.dispose();
		}
	}
}
