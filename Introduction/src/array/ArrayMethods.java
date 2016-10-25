package array;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
//		int[] arr = {2,3,4,6,9,11,12,15};
//		checkHalfway(arr,12,0, arr.length-1);
//		swap(arr, 0, arr.length-1);
//		shuffle(arr);
//		print(arr);
		
		int[] arr = {3,9,6,11,14,16};
		int[] subArr = getSubArray(arr,2,4);
		print(subArr);

	}
	private static void print(int[] arr) {
		for(int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i] +", ");
		}
		System.out.println(arr[arr.length-1]);
		
	}
	private static void shuffle(int[] arr) {
		for(int i= 0; i< arr.length; i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr, i , random);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	//return number of elements less than d
	public static int countUnderBound(double[] arr, double d){
		int count = 0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]<d){
				count++;
			}
		}
		return count;
	}
	
	public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] subArray = new int[endIndex - startIndex +1];
		for(int i =0; i<subArray.length;i++){
			subArray[i] = arr[i+startIndex];
		}
		return subArray;
	}
	
	public static boolean contains(int[] arr, int[] subArray){
		for(int i=0; i< arr.length; i++){
			if(arr[i] == subArray[0]){
				int j = 0;
				while(j<subArray.length){
					if(subArray[j] == arr[i+j] && j == subArray.length-1){
						return true;
					}
					else if(subArray[j] != arr[i]){
						break;
					}
					j++;
				}
			}
		}
		return false;
	}
	
	
/**
 *  Returns true if searchValue is less than the element
 *  halfway between begin and end
 * @param arr the int[] to be seached
 * @param i
 * @param j
 * @param length
 */
	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin+end+1)/2];
	}

}
