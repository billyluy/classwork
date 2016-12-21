package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}
	
	@Override
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font(getFont(), Font.PLAIN,getSize()));
		FontMetrics fm = g.getFontMetrics();//width of pixel
		g.setColor(Color.black);
		if(getText() != null){
			String[] words = getText().split(" ");//splits word at every space
			if(words.length >0){
				int i =0;
				final int SPACING = 2;
				int y =0 + fm.getHeight()+SPACING; //height of the font + spacing 
				String line = words[i] + " ";
				i++;
				while(i < words.length){//make more lines
					//controls a single line of text
					while(i < words.length && fm.stringWidth(line)+fm.stringWidth(words[i])<getWidth()){
						//adds next word onto the line and looks at the next word
						line+= words[i]+" ";
						i++;
					}
					if(y<getHeight()){
						//draws the previous string before moving onto the next line
						g.drawString(line, 2, y);
						//increase y so that it goes to next line
						y += fm.getDescent()+fm.getHeight()+SPACING;
						//empties the temp string
						line = " ";
					}else{
						break;
					}
				}
			}
		}
	}

}
