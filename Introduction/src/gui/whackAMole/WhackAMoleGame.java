package gui.whackAMole;

import java.util.ArrayList;

import gui.GUIApplication;

public class WhackAMoleGame extends GUIApplication {

	public WhackAMoleGame(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(),getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		WhackAMoleGame wamg = new WhackAMoleGame(800,500); //instantiate
		Thread game = new Thread(wamg); //create thread for game
		game.start(); //start the thread/game

	}
	


}
