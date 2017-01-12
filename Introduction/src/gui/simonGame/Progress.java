	package gui.simonGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui.components.Component;

//public class Progress extends Component implements ProgressInterfaceBillyLuy {
//	
//	private int size;
//	private int roundNumber;
//	private Color bgColor;
//	private Color fontColor;
//	private ArrayList<String> stringList;
//	
//	public Progress() {
//		super(50, 50, 200, 100);
//		Color limeGreen = new Color(125, 255, 100);
//		bgColor = limeGreen;
//		stringList = new ArrayList<String>();
//		fontColor = Color.black;
//	}
//
//	@Override
//	public void gameOver() {
//		bgColor = Color.RED;
//		stringList.add("WRONG, GAME OVER!");
//		update();
//	}
//
//	@Override
//	public void setSequenceSize(int size) {
//		this.size = size;
//		updateArrayList();
//		update();
//	}
//
//	@Override
//	public void setRound(int roundNumber) {
//		this.roundNumber = roundNumber;
//		updateArrayList();
//		update();
//	}
//	
//	public void updateArrayList() {
//		while(stringList.size() > 0) stringList.remove(0);
//		stringList.add("Round Number " + roundNumber);
//		stringList.add("Sequence Length " + size);
//	}
//	
//	@Override
//	public void update(Graphics2D g) {
////		clear
//		g = clear();		
//		
////		draw label
//		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//		g.setColor(bgColor);
//		g.fillRect(0, 0, getWidth(), getHeight());
//		g.setColor(Color.BLACK);
//		g.drawRect(0, 0, getWidth()-1, getHeight()-1);
//		
////		draw text
//		g.setColor(fontColor);
//		Font font = new Font("Comic Sans", Font.PLAIN, 14);
//		g.setFont(font);
//		FontMetrics fm = g.getFontMetrics();
//		if(stringList != null && stringList.size() > 0) {
//			for(int i = 0; i < stringList.size(); i ++) {
//				g.drawString(stringList.get(i), (getWidth()-fm.stringWidth(stringList.get(i))) / 2, (fm.getAscent() + fm.getDescent()) * (i+1));
//			}
//		}
//	}
//
//	@Override
//	public void increaseRoundNum(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int getRoundNum() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void setRoundNum(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int getSequenceLength() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void setSequenceLength(int size) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
//
//
//

public class Progress extends Component implements ProgressInterfaceBillyLuy {
	
	private String round;
	private String sequence;
	private boolean gameOver;
	
	private static final int W = 120;
	private static final int H= 50;

	public Progress() {
		super(60, 60, W, H);
		
	}

	public void setRound(int roundNumber) {
		round = "Round "+roundNumber;
		update();
	}
	
	public void setSequenceLength(int size) {
		sequence = "Sequence size "+size;
		update();
	}
	
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
			String text = "Game Over";
			g.drawString(text, 100,20);
			g.drawString(sequence, 300, 40);
			System.out.println("I pick rong");
		}else{
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, W, H);
			g.setColor(Color.black);
			g.drawRect(0, 0, W-1, H-1);
			System.out.println(round+" "+sequence);
			if(round !=null && sequence != null){
				g.drawString(round, 100, 20);
				g.drawString(sequence, 300, 40);
			}
		}
	}

}
