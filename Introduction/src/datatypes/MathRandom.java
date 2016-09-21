package datatypes;

//import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		int[] results = new int[6]; // = [0,0,0,0,0,0,]
		int totalRolls = 10000;		
		for(int index = 0; index < totalRolls; index++) {
			int roll = rollUnFairDie();
			System.out.println("Roll # "+(index+1)+" Die is "+ roll); //index +1 makes it count form 1 to 10
			results[roll-1]++;//roll-1 is the index of the array that gets increased
		}
		
		for(int i =0; i < 6; i++) {
			double percentage = (int)(1000*((double)results[i]/totalRolls)) / 10.0;
			System.out.println((i+1)+" was rolled "+ percentage+"% of the times");
		}
	}
	
	public static int rollFairDie() {
//		Random gen = new Random(); //generator
//		return gen.nextInt(6)+1; // gens a random number up to 6
		
		double rand = Math.random(); //creates a number between 0 and 1
		int roll = (int) (6*rand); //cast 6 * rand into a int makes a int from 0 to 5
		return (roll+1);
	}
	
	public static int rollUnFairDie() {
		double rand = Math.random();
		int roll = (int) (8*rand);
		if((roll+1) == 7||(roll+1) == 8){
			return 3;
		}
		return (roll+1);
	}

}
