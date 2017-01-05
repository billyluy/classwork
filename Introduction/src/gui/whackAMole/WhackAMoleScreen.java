package gui.whackAMole;

import java.util.ArrayList;

import gui.components.Action;
import gui.components.ClickableScreen;
import gui.components.TextLabel;
import gui.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0; //init timeLeft
		Thread play = new Thread(this);
		play.start();
	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"Sample");
		timeLabel = new TextLabel(360,40,80,40,"30.0");
		viewObjects.add(timeLabel);
		viewObjects.add(label);
		viewObjects.add(player);
	}
	
	/**
	*to implement later, after Character Team implements PlayerInterface
	*/
	private PlayerInterface getAPlayer() {
		return new Player();
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*/
	private MoleInterface getAMole() {
		return new Mole((int)Math.random()*getWidth(), (int)Math.random()*getHeight());
	}
	
	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!");
		label.setText("");
		//Since this is a timed game, we will use a while loop.
		//This isn't necessary for games that aren't timed
		while(timeLeft>0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		double chance = .1*(60-timeLeft)/60;
		if(Math.random()<chance){
			//create a mole
			final MoleInterface mole = getAMole(); //keeps the mole the same, the mole never changes
			mole.setApperanceTime((int)(500+Math.random()*2000));
			//tell the mole what to do when clicked
			mole.setAction(new Action(){
				public void act(){
					player.IncreaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i =0; i < moles.size();i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getApperanceTime()-100; //Amount of time the mole stays on the screen
			m.setApperanceTime(screenTime);
			if(m.getApperanceTime() >= 0){
				remove(m);//remove from the screen
				moles.remove(m); //remove from the list
				i--; //*****Compensate for the mole that got removed*****
			}
		}
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft-=.1;
		//*****must cast because computer stores in binary therefore when it represents it's not a clean conversion******
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}

	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
