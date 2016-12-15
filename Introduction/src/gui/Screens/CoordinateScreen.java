package gui.Screens;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen {

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
		Button button = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
			public void act(){
				//code for action will be in here.
			}
		});
		viewObjects.add(button);
	}

}
