package introunit;

public class Student {

	private String name; //encapsulation
	
	//constructor(no return type. it creates students)
	public Student(String name){
		//initialize fields
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hi, my name is "+this.name);
	}
}
