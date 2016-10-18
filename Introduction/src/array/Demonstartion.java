package array;

public class Demonstartion {
	static int [] results = new int[11]; 

	public static void main(String[] args) {
		int[] dieArray = new int[1000];
		twoDieRoll(dieArray);
		int[] numPop = new int [50];
		numberedPopulate(numPop);
		int[] ranPop = new int [(int)(Math.random()*1000)];
		randPopulate(ranPop);
		
		printArray(dieArray);
	}
	
	private static void twoDieRoll(int[] array) {
		for(int i = 0; i < array.length;i++ ){
			array[i] = (int)(Math.random()*6)+1 + (int)(Math.random()*6)+1;
		}
	}
	
	private static void verifyMath(int[] array){
		for(int i = 0; i <array.length; i++ ){
			results[array[i]-2]++;
		}
	}
	
	private static void printResults(int[] array){
		for(int i =0; i<array.length; i++){
			System.out.println((i+2)+"is rolled"+((double)array[i]/results.length *100));
		}
	}

	private static void numberedPopulate(int[] array){
		for(int i = 0; i < array.length;i++ ){
			array[i] = (i+1);
		}
	}
	
	private static void randPopulate(int[] array){
		for(int i = 0; i < array.length;i++){
			array[i] = (int)(Math.random()*10);
		}
	}
	
	private static void printArray(int[] array){
		for(int i =0;i <array.length;i++){
			System.out.println(array[i]);
		}
	}
}
