package sort;

public class MainBattle {
	
	public static void main(String[] args){
		Pokemon raticate = new Pokemon("Raticate",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		//create a way for raticate and bulbasaur to attack
		raticate.lapse();
		bulbasaur.lapse();
		printScore(raticate, bulbasaur);
	}
	
	private static void

}
