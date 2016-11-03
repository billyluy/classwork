package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {
	public static void main(String[] args){
		boolean[][] mines = new boolean[6][6];
		createMine(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
		
		
	}
	
	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row =0; row <field.length;row++){
			for(int col=0;col<field[0].length;col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}
				else{
					field[row][col] = countAdjacent(mines,row,col);
				}
			}
		}
		
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		//r and c represent coordinates of element we are providing a string for
		int count =0;
		//loop from row above to below
		for(int row = r-1;row <= r+1;row++){
			//loop from col left to right
			for(int col=c-1;col<=c+1;col++){
				//makes sure there is no out of bound
				if(row != r && col != c){
					if(row>=0 && row <mines.length&& col >= 0 && col < mines[0].length)
				}
			}
		}
		return null;
	}

	private static void createMine(boolean[][] mines, int numberOfMines) {
		while(numberOfMines > 0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
		
	}

	public static void drawPic(){
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
	
	public static void twoDString(){
		int[] arr = {0,1,2,3,4,5,6,7};
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
	}
}
