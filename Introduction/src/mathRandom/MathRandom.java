package mathRandom;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		for(int index = 0; index < 10; index++){
			System.out.println("Roll # "+(index+1)+" Die is "+ rollFairDie()); //index +1 makes it count form 1 to 10
			
		}
	}
	
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6)+1; // gens a random number up to 6
	}
	
	public static int rollUnFairDie(){
		Random gen = new Random();
		return gen.nextInt(6)+1; // gens a random number up to 6
	}

}
