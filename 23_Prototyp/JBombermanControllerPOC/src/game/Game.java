package game;

import java.util.Observable;

public class Game extends Observable {

	public Game() {
		
	}
	
	public void playGame() {
		
		new Thread(() -> {
			try {
				
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("playGAme");
			setChanged();
			notifyObservers("finished");
		}).start();
	}
}
