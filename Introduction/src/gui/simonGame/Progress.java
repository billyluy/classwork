	package gui.simonGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui.components.Component;

public class Progress extends Component implements ProgressInterfaceBillyLuy {

	private static final int WIDTH = 120;
	private static final int HEIGHT = 50;

	private boolean gameOver;
	private String round;
	private String sequence;

	public Progress() {
		super(60,60,WIDTH,HEIGHT);
	}

	public void setRound(int roundNumber) {
		round = "Round "+roundNumber;
		update();
	}

	public void setSequenceLength(int size) {
		sequence = "Sequence length "+size;
		update();
	}

	public void gameOver() {
		gameOver = true;
		update();
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(new Color(255,55,90));
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.white);
			String go = "GAME OVER!";
			g.drawString(go, (WIDTH - fm.stringWidth(go))/2, 20);
			g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);

		}else{
			g.setColor(new Color(220,255,230));
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.black);
			g.drawRect(0, 0, WIDTH-1, HEIGHT-1);
			if(round !=null && sequence != null){

				g.drawString(round, (WIDTH - fm.stringWidth(round))/2, 20);
				g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);
			}
		}
	}

}



//public class Progress extends Component implements ProgressInterfaceBillyLuy {
//	
//	private String round;
//	private String sequence;
//	private boolean gameOver;
//	
//	private static final int W = 120;
//	private static final int H= 50;
//
//	public Progress() {
//		super(60, 60, W, H);
//		
//	}
//
//	public void setRound(int roundNumber) {
//		round = "Round "+roundNumber;
//		update();
//	}
//	
//	public void setSequenceLength(int size) {
//		sequence = "Sequence size "+size;
//		update();
//	}
//	
//	public void gameOver() {
//		gameOver = true;
//		update();
//	}
//
//	@Override
//	public void update(Graphics2D g) {
//		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		FontMetrics fm = g.getFontMetrics();
//		if(gameOver){
//			g.setColor(Color.RED);
//			g.fillRect(0, 0, W, H);
//			String text = "Game Over";
//			g.drawString(text, 100,20);
//			g.drawString(sequence, 300, 40);
//		}else{
//			g.setColor(new Color(220,255,230));
//			g.fillRect(0, 0, W, H);
//			g.setColor(Color.black);
//			g.drawRect(0, 0, W-1, H-1);
//			if(round !=null && sequence != null){
//
//				g.drawString(round, 100, 20);
//				g.drawString(sequence, 300, 40);
//			}
//		}
//	}
//
//}
