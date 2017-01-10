package gui.SampleGame;

import java.util.ArrayList;

import gui.Screen;
import gui.components.Graphic;
import gui.components.Visible;

public class MyScreen extends Screen {
	
	private Graphic boo;

	public MyScreen(int width,int height){
		super(width,height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		boo = new Graphic(30,30,100,100,"resources/sampleImages/Boo_Island_Tour.png");
		viewObjects.add(boo);
	}

}
