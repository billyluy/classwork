package array;

public class ArraysMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime)+" milliseconds");
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
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
}
