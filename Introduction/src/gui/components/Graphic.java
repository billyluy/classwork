package gui.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {
	
	//FIELDS
	private BufferedImage image;
	private boolean loadedImages ;
	private int x;
	private int y;
	
	/**
	 * FULL size graphics constructor
	 * @param x
	 * @param y
	 * @param imageLocation
	 */
	public Graphic(int x, int y, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,0,0);
	}
	
	/**
	 * CUSTOM size graphics constructor
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param imageLocation
	 */
	public Graphic(int x, int y, int w, int h, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,w,h);
	}
	
	/**
	 * SCALED size graphics constructor
	 * @param x
	 * @param y
	 * @param scale
	 * @param imageLocation
	 */
	public Graphic(int x, int y, double scale, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,scale);
	}

	private void loadImages(String imageLocation, double scale) {
		try{
			//get full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int)(icon.getIconWidth()*scale);
			int newHeight = (int)(icon.getIconHeight()*scale);
			image = new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0,newWidth,newHeight,0,0,icon.getIconWidth(),icon.getIconHeight(), null);
		}catch(Exception e){
			
		}
		
	}

	private void loadImages(String imageLocation, int w, int h) {
		try{
			//full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w <=0 && h <=0){
				//use full size icon
				image = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				//use Graphics2D tool to copy the icon
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}else{
				//use custom size icon
				image = new BufferedImage(w,h, BufferedImage.TYPE_INT_ARGB);
				//use Graphics2D tool to copy the icon
				Graphics2D g = image.createGraphics();
				//note to self this is how you crop:
				/**
				 * image to draw
				 * xCoord of destination
				 * yCoord of destination
				 * width of destination
				 * height of destination
				 * xCoord of target
				 * yCoord of target
				 * width of target
				 * height of target 
				 * null
				 */
				g.drawImage(icon.getImage(), 0, 0,w,h,0,0,icon.getIconWidth(),icon.getIconHeight(), null);
			}
			loadedImages = true;
		}catch(Exception e){
			//this happens when you don't name the image correctly
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {
		return image;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY(){
		return y;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimate() {
		return false;
	}

	@Override
	public void update() {
		//does nothing image stays the same
	}

}
