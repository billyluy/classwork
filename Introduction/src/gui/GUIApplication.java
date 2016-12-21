package gui;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import GUISampleGame.MouseFollower;

public abstract class GUIApplication extends JFrame implements Runnable{
	
	//FIELDS
	private Screen currentScreen;
	
	public GUIApplication(int width, int height){
		super();
		setUndecorated(false); // hide / show window
		setBounds(20,20,width,height);
		//terminates program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}

	public abstract void initScreen();

	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void setScreen(Screen s){
		//stop listening to old screen
		if(currentScreen!=null){
			MouseListener m1 = currentScreen.getMouseListener();
			if(m1 != null){
				removeMouseListener(m1);
			}
			MouseMotionListener mm1 = currentScreen.getMouseMotionListener();
			if(mm1!=null){
				removeMouseMotionListener(mm1);
			}
		}
		currentScreen = s;
		//start listening to new screen
		if(currentScreen != null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void run(){
		while(true){
			//redraws the display
			currentScreen.update();
			//update the window
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}