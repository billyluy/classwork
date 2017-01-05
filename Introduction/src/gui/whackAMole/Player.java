package gui.whackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Player extends Component implements PlayerInterface {
	
	private int score;

	public Player() {
		super(20,20,100,100); //you can control the size and shape 
	}

	@Override
	public void IncreaseScore(int i) {
		score += i;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		//draws the circle and score everytime score updates
		
		g.setColor(Color.BLACK);
		g.drawOval(0,0,99,99);
		g.drawString("Score = "+score, 40, 45);
	}

}
