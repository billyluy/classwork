package GUISampleGame;

import java.util.ArrayList;

import gui.GUIApplication;
import gui.Screen;
import gui.Screens.CoordinateScreen;
import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class ClickableGraphicGame extends GUIApplication {
	
	public static ClickableGraphicGame game; //only one exits
	public static ClickableGraphicScreen cgs;

	public ClickableGraphicGame(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void initScreen(){
		cgs = new ClickableGraphicScreen(getWidth(), getHeight());
		setScreen(cgs);
	}

	public static void main(String[] args) {
		game = new ClickableGraphicGame(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
