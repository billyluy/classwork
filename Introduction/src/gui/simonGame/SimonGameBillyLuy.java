package gui.simonGame;

import gui.GUIApplication;
import gui.whackAMole.WhackAMoleGame;
import gui.whackAMole.WhackAMoleScreen;

public class SimonGameBillyLuy extends GUIApplication {

	public SimonGameBillyLuy(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		SimonScreenBillyLuy simonScreen = new SimonScreenBillyLuy(getWidth(),getHeight());
		setScreen(simonScreen);
	}

	public static void main(String[] args) {
		SimonGameBillyLuy simonGame = new SimonGameBillyLuy(800,500); //instantiate
		Thread game = new Thread(simonGame); //create thread for game
		game.start(); //start the thread/game
	}

}
