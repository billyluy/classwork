package gui.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;

public abstract class ClickableScreen extends Screen implements MouseListener {
	
	private ArrayList<Clickable> clickables;

	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void initAllObjects(ArrayList<Visible> clickables);

	@Override
	public void mouseClicked(MouseEvent m) {
		for(int i =0; i<clickables.size();i++){
			if(clickables.get(i).isHovered(m.getX(), m.getY())){
				clickables.get(i).act();
				break;
			}
		}

	}
	
	public void addObject(Visible v){
		super.addObject(v);
		if(v instanceof Clickable){
			clickables.add((Clickable)v);
		}
	}
	
	public void remove(Visible v){
		super.remove(v);
		clickables.remove(v);
	} 
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseEntered(MouseEvent m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible object : viewObjects){
			if(object instanceof Clickable){
				clickables.add((Clickable)object);
			}
		}
	}

}
