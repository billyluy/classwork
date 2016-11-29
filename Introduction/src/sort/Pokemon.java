package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		hp=100;
		this.poisoned = false;
	}
	
	public String getName(){
		return name;
	}
	
	public void iChooseYou(){
		System.out.println(name+"I choose you!");
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public void lapse(){
		if(poisoned)hp -= 15;
	}
}
