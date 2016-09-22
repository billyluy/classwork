package datatypes;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	static int lineCount;
	
	public static void main(String[] args) {
		creatAScanner();
		lineCount = 0;
//		demonstrateStringMethods();
		promptName();
		talkForever();
		
	}
	
	public static void promptName() {
		print("Hello, human! I am a board covered with semiconductors\n and other such electronic components, What is your name?");
		// /n makes the line break
		user = input.nextLine(); //user referencing the field user
		print("Hello "+ user);
	}

	public static void talkForever() {
		while(true){ //what ever is inside the while loop is true, it keeps running
			promptInput();
		}
	}
	
	public static void promptInput() {
		print(user+" Try inputing a string");
		String userInput = input.nextLine();
		print("You typed "+userInput);
		
	}
	
	public static void print(String s){
		lineCount++ ;
		print("Line #: " + lineCount+" "+s);//don't need this line, can use print() instead
	}


	public static void creatAScanner() {
		input = new Scanner(System.in);//allows for user input
		
	}
	
	public static void demonstrateStringMethods() {
//		String text = new String("Hello World"); 
		String text1 = "Hello World"; //same as above
		String text2 = "Hello "; //same as above
		String text3 = "World";
		if(text1 .equals (text2 + text3) ) //must use .equals for comparing two strings
			print("These strings are equal");
		
		print(text1);
		print(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzya";
		
		if(word1.compareTo(word2)< 0)
			print("Word1 is before Word2," + " lexicographically.");
		
	}

}
