package datatypes;

public class StringPractice {

	public static void main(String[] args) {
//		String text = new String("Hello World");
		String text1 = "Hello World"; //same as above
		String text2 = "Hello "; //same as above
		String text3 = "World";
		if(text1 .equals (text2 + text3) ) //must use .equals for comparing two strings
			System.out.println("These strings are equal");
		
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzya";
		
		if(word1.compareTo(word2)< 0)
			System.out.println("Word1 is before Word2," + " lexicographically.");

	}

}
