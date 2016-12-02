package sort;

public class MainBattle {
	
	public static void main(String[] args){
		Pokemon raticate = new Pokemon("Raticate",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		raticate.attack(bulbasaur,new Attack() {
			public void attack(Pokemon target) {
				System.out.println("Superfang is used!");
				int newHp = target.getHp()/2;
				target.setHP(newHp);
			}
		});
		bulbasaur.attack(raticate, new Attack() {
			public void attack(Pokemon target) {
				System.out.println("Toxic is used!");
				target.setPoisoned(true);
			}
		});
		//create a way for raticate and bulbasaur to attack
		raticate.lapse();
		bulbasaur.lapse();
		printScore(raticate, bulbasaur);
	}
	
	private static void printScore(Pokemon p1, Pokemon p2){
		System.out.println(p1.getName()+", Hp ="+p1.getHp());
		System.out.println(p2.getName()+", Hp ="+p2.getHp());
	}

}
