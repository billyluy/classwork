package array;

public class ArraysMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime)+" milliseconds");
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
