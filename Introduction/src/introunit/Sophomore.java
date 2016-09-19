package introunit;

public class Sophomore extends Student {

	public Sophomore(String name) {
		super(name);
		
	}
	public void talk(){
		super.talk();
		System.out.println("I am a Sophomore");
	}
	
}
