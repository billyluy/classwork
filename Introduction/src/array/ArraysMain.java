package array;

public class ArraysMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has" + " a number equal to "+sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime)+" milliseconds");
		
		testPrimes(50);
	}
	
	private static void testPrimes(int numberToTest) {
		int lastToCheck =(int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i=0; i< numberToTest; i++){
			theNumbers[i]=true;
		}
		theNumbers[0] =false;
		theNumbers[1] =false;
		int increase =2;
		boolean first = true;
		for(int test =2;test< numberToTest; test += increase ){
			 if(!first){
				 theNumbers[test] = false;
			 }
			 else
				 first = false;
		}
		for(int i =0; i<theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime");
			}
		}
		
	}

	private static void passByValueDemo(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		int ten = 10;
		increase(ten);
		System.out.println("Ten, increased is "+ten);
		
		//in this method, we pass the Element
		//(a variable) not the array, so no change will be made
		System.out.println("Before "+someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \"changeString\" method" +someStrings[99]);
		changeArray(someStrings);
		System.out.println("After \"changeArray\" method" +someStrings[99]);
		changeArrayElement(someStrings,99);
		System.out.println("After \"changeArrayElement\" method" +someStrings[99]);
	}
	
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item "+(i+1);
		
	}

	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for (int i =0; i < someStrings.length; i++){
			someStrings[i] = "new item "+(i+1);//only someStrings in this method(local) changes not the global variables
		}
		
	}
	
	//this method does nothing since local variables don't last through the entire code
	private static void increase(int x){
		x = x+1;
	}
	
	private static void changeString(String s){
		s = "this string has been changed";
	}
	
	private static void printArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
	}

	private static void populateArray(String[] a) {
		for(int i = 0; i < a.length;i++ ){
			a[i] = "value "+(i+1);
		}
	}

	public static void arrayIntroMethod(){
		//construct 2 integer arrays
		//these two do the same thing
		//primitive type arrays fill with ZEROS(0,0.0,false)
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3]; //3 integer array filled with zeros
		//iterate (2 ways)
		//FIRST METHOD "FOR LOOP"
		//WHEN TO USE THIS FOR LOOP
		//	-the index of the data is important to reference
		//	-you need to customize how you iterate
			//increase by two, go backwards, etc
		for(int index = 0; index < booleans.length; index++){
			System.out.println(index+") "+booleans[index]);
		}
		//SECOND METHOD "FOR EACH"
		//always go in order, does not keep track of index
		for(boolean b: booleans){
			System.out.println(b+"");
		}
				
		//these two constructors are different
		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];
		//bottom one fills with null not empty
		//this loop instantiates the strings
		for(int i = 0; i < strings2.length;i++ ){
			strings2[i] = "value "+(i+1);
		}
		//this loop prints the string
		for(String s: strings2){
			System.out.println(s);
		}
	}
}
