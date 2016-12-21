package GUISampleGame;

import java.util.ArrayList;

import gui.Screen;
import gui.components.Graphic;
import gui.components.Visible;

public class MyScreen extends Screen {
	
	private Graphic thug;

	public MyScreen() {
		// TODO Auto-generated constructor stub
		super(500, 500);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		thug = new Graphic(30,30,100,100,"resources/sampleImages/Crashthug.jpg");
		viewObjects.add(thug);
	}

}
