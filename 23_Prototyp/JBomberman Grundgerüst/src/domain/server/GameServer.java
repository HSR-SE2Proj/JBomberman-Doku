package domain.server;

import utils.GameLoop;
import action.ActionQueue;
import action.Action;

public class GameServer implements GameLoop {

	private ActionQueue queue;
	//GameObjects
	
	@Override
	public void loop() {
		while(!queue.isEmpty()) {
			Action action = queue.take();
			//handle Action
		}
	}
}
