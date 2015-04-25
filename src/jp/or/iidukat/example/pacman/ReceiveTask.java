package jp.or.iidukat.example.pacman;

import Team22.DS.cmu.edu.Message;
import Team22.DS.cmu.edu.MessagePasser;

public class ReceiveTask implements Runnable {

	private PacmanGame game;
	private MessagePasser passer;

	public ReceiveTask(PacmanGame game, MessagePasser passer) {
		this.game = game;
		this.passer = passer;
	}

	@Override
	public void run() {
		Message m;
		for (;;) {
			m = passer.receive();
			updatePos(m.getSource(), (PosInfo) m.getData());
		}
	}

	private void updatePos(String playerName, PosInfo coords) {
		//update game object here
	}

}
