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
	
	 public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
			 attack.attack(target);
			 System.out.println("The attack hit");
		 }else{
			 System.out.println("The attack missed");
		 }
	 }
	
	public String getName(){
		return name;
	}
	
	public int getHp(){
		return hp;
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
