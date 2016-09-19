package introunit;

public class Senior extends Student { //polymorphism

	private String internship; //encapsulation
	
	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
	}

	public void talk(){
		super.talk();//call the super method(calls the regular talk method for students first)
		System.out.println("... and I am a senior!");
		System.out.println("I intern as a "+internship);
	}
}
