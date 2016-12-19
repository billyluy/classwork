package gui.Screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private TextArea text;
	private Button button;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextArea(20, 200, 500, 40, "Some text that is very very very long");
		viewObjects.add(text);
		
		button = new Button(40,50,100,30,"Button",new Color(255,255,255), new Action(){
			public void act(){
				//code for action will be in here.
			}
		});
		viewObjects.add(button);
	}

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse x coord
		int my = e.getY();//get mouse y coord
		text.setText("Mouse at: "+mx+" + "+my);
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
