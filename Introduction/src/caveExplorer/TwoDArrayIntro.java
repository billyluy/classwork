package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {
	public static void main(String[] args){
//		int[] arr = {0,1,2,3,4,5,6,7};
//		System.out.println(Arrays.toString(arr));
//		
//		//rows, columns
//		String[][] arr2D = new String[4][3];
//		for(int row =0; row < arr2D.length; row++){   //0-4
//			for(int col =0; col<arr2D[row].length; col++){
//				arr2D[row][col] = "("+row+","+col+")";
//			}
//		}
//		
//		//print each row
//		for(String[] row:arr2D){
//			System.out.println(Arrays.toString(row));
//		}
		
		String[][] pic = new String[10][12];
		
		for(int i =0; i<pic.length;i++){
			for(int j=0; j <pic[i].length;j++){
				pic[i][j] = " ";
			}
		}

		for(int i = 0; i<pic.length;i++){
			for(int j=0; j <pic[i].length;j++){
				if((int)(Math.random()*10)+1 == 10){
					pic[i][j] = "v";
				}
			}
		}
		
		pic[0][1] ="\\";
		pic[2][3] ="\\";
		pic[1][2] ="O";
		pic[0][2] ="|";
		pic[2][2] ="|";
		pic[1][3] ="-";
		pic[1][1] ="-";
		pic[0][3] ="/";
		pic[2][1] ="/";
				
		
		for(int i =7; i<pic.length;i++){
			for(int j=0; j <pic[i].length;j++){
				pic[i][j] = "M";
			}
		}
		
		for(int i =0; i<pic.length;i++){
			for(int j=0; j <pic[i].length;j+=pic[i].length-1){
				pic[i][j] = "|";
			}
		}
		
		for(int i =0; i<pic.length;i+=pic.length-1){
			for(int j=0; j <pic[i].length;j++){
				pic[i][j] = "_";
			}
		}
		
		for(int i =0; i<pic.length;i++){
			pic[i][0] ="|";
			pic[i][pic[0].length-1]="|";
		}
		
		printPic(pic);
	}
	
	public static void printPic(String[][] arr){
		for(int i =0; i<arr.length;i++){
			for(int j=0; j <arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
