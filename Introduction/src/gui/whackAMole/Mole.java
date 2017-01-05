package gui.whackAMole;

import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y) {
		super(x, y, .9, "resources/sampleImages/mole.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getApperanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setApperanceTime(int screenTime) {
		appearanceTime = screenTime;

	}

}
