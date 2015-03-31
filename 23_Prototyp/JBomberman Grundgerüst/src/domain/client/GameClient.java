package domain.client;

import java.util.Observable;
import utils.GameLoop;
import action.ActionQueue;
import action.Action;

public class GameClient extends Observable implements GameLoop {

	private ActionQueue queue;
	//Sprites
	
	@Override
	public void loop() {
		
		while(!queue.isEmpty()) {
			Action action = queue.take();
			//handle Action
		}
		
		notifyObservers();
	}
}