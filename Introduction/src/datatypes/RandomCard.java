package datatypes;

import java.util.Random;

public class RandomCard {

	public static void main(String[] args) {
//		System.out.println("i am a " + randSuit());
		for(int i = 0; i < 100; i++){
		System.out.println("The random card drawn is a "+randSuit()+ " " + randValue());
		}
	}
	
	public static String randSuit(){
		String[] suits = {"Spade","Heart","Club","Diamond"};
//		double rand = Math.random(); 
//		int roll = (int) (suits.length*rand); 
//		return suits [(roll +1)];
//		
//		int idx = new Random().nextInt(suits.length);
//		String random = (s[idx]);
		
		Random gen = new Random(); 
		return suits[gen.nextInt(suits.length)]; 
	}
	
	public static String randValue(){
		String[] values  = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		Random gen = new Random(); 
		return values[gen.nextInt(values.length)]; 
	}

}
