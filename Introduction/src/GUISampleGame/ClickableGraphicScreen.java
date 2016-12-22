package GUISampleGame;

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
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		boo = new ClickableGraphic(200,200,"resources/sampleImages/Boo_Island_Tour.png"){
			public void act(){
				ClickableGraphicGame.game.setScreen(MouseFollower.myScreen);
			}
		};
		viewObjects.add(boo);

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
