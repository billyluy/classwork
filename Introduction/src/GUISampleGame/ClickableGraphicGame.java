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
	public static ClickableGraphic boo;
	public static MyScreen myScreen;

	public ClickableGraphicGame(int width, int height) {
		super(width, height);
	}
	
	public void initScreen(){
		boo = new ClickableGraphic(getWidth(), getHeight(), "resources/sampleImages/Boo_Island_Tour.png");
		setScreen(boo);
		myScreen = new MyScreen(getWidth(), getHeight());
	}

	public static void main(String[] args) {
		game = new ClickableGraphicGame(500,500);
		Thread app = new Thread(game);
		app.start();
	}

}
