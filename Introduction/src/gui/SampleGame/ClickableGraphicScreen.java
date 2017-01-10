package gui.SampleGame;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.ClickableGraphic;
import gui.components.Visible;

public class ClickableGraphicScreen extends Screen implements MouseMotionListener, MouseListener{
	
	private ClickableGraphic boo;

	public ClickableGraphicScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		boo = new ClickableGraphic(10, 10,.1, "resources/sampleImages/Boo.png");
		
		boo.setAction(new Action() {
			@Override
			public void act() {
				boo.setX(boo.getX()+10);
				boo.setY(boo.getY()+10);
			}		
		});
		viewObjects.add(boo);
	}
	
	public MouseListener getMouseListener() {
		return this;
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(boo.isHovered(e.getX(), e.getY())){
			boo.act();
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
