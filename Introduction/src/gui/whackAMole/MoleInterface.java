package gui.whackAMole;

import gui.components.Action;
import gui.components.Clickable;

/**
 * @author Student6
 * This is for my partner, the Enemy Designer to implement
 */

public interface MoleInterface extends Clickable {

	int getApperanceTime();

	void setApperanceTime(int screenTime);

	void setAction(Action action);

}
