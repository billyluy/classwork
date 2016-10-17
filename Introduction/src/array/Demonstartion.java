package array;

public class Demonstartion {

	public static void main(String[] args) {
		int[] dieArray = new int[1000];
		twoDieRoll(dieArray);
		int[] numPop = new int [50];
		numberedPopulate(numPop);
		int[] ranPop = new int [(int)(Math.random()*1000)];
		randPopulate(ranPop);
		
		printArray(ranPop);
	}
	
	private static void twoDieRoll(int[] array) {
		for(int i = 0; i < array.length;i++ ){
			array[i] = (int)(Math.random()*6)+1 + (int)(Math.random()*6)+1;
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
