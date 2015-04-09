package application;

import view.GameFrame;
import view.PartyFrame;
import java.util.Observable;

public class controller extends Observable {
	
	public controller() {
		
	}
	
	public void startGame() {
		GameFrame gf = new GameFrame(this);
		gf.setVisible(true);
	}
	
	public void gameFinished() {
		setChanged();
		notifyObservers("finished");
		
	}
}
