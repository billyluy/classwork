package gui.simonGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui.components.Component;

public class Progress extends Component implements ProgressInterfaceBillyLuy {
	
	private String round;
	private String sequence;
	private boolean gameOver;
	
	private static final int W = 150;
	private static final int H= 70;

	public Progress() {
		super(60, 60, W, H);
		
	}
	@Override
	public void setRound(int roundNumber) {
		round = "Round "+roundNumber;
		update();
	}
	
	@Override
	public void setSequenceLength(int size) {
		sequence = "Sequence length "+size;
		update();
	}
	
	@Override
	public void gameOver() {
		gameOver = true;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(Color.RED);
			g.fillRect(0, 0, W, H);
			g.setColor(Color.black);
			String text = "Game Over";
			g.drawString(text, 40,20);
			g.drawString(sequence, 40, 40);
		}else{
			g.setColor(Color.pink);
			g.fillRect(0, 0, W, H);
			g.setColor(Color.black);
			g.drawRect(0, 0, W-1, H-1);
			if(round !=null && sequence != null){
				g.drawString(round, 40, 20);
				g.drawString(sequence, 40, 40);
			}
		}
	}

}
