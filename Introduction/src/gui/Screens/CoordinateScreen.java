package gui.Screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.SampleGame.MouseFollower;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	
	//FIELDS
	private Graphic thug;
	private TextArea area;
	private TextLabel text;
	private Button button;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 100, 500, 100, "Some text that is very very very long");
		viewObjects.add(text);
		
		button = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		viewObjects.add(button);
		
//		
//		area = new TextArea(20, 200, 200, 100, "Some text that is very very very long");
//		viewObjects.add(area);
//		
//		
//		thug = new Graphic(30,30,100,100,"resources/sampleImages/Crashthug.jpg");
//		viewObjects.add(thug);
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
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
