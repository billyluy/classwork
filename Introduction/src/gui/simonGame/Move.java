package gui.simonGame;

public class Move implements MoveInterfaceBillyLuy {
	
	private ButtonInterface b;

	public Move(ButtonInterface b) {
		this.b = b;
	}

	@Override
	public ButtonInterface getButton() {
		return b;
	}

}
