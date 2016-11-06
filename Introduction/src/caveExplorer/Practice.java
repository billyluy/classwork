package caveExplorer;

import java.util.Scanner;

public class Practice {
	
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args){
//		String[][] arr = new String[6][6];
//		makeMap(arr);
		print(6,6,0,0);
		
		arr2D = new String[5][4];
		pic = new String[5][4];
		for(int row =0; row < arr2D.length; row++){
			for(int col =0; col<arr2D[row].length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		for(int row =0; row < pic.length; row++){
			for(int col =0; col<pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		
		i=2;
		j=3;
		in = new Scanner(System.in);
		startExploring();
	}
	
	private static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("you are in room"+arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w,a,s,d");
				input = in.nextLine();
			}
			for(int row =0; row < pic.length; row++){
				for(int col =0; col<pic[row].length; col++){
					pic[row][col] = " ";
				}
			}
			interpretInput(input.toLowerCase());
			pic[i][j]="X";
		}
		
	}

	private static void interpretInput(String input) {
		int iOrig =i;
		int jOrig =j;
		if(input.equals("w")&& i>0)
			i--;
		else if(input.equals("s")&& i+1<arr2D.length)
			i++;
		else if(input.equals("a")&& j>0)
			j--;
		else if(input.equals("d")&& j+1<arr2D[0].length)
			j++;
		if(iOrig ==i && jOrig ==j){
			System.out.println("You are at the edge of the universe. You can move no further in that direction.");
		}
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String [] keys = {"w","a","s","d"};
		for(String key:keys){
			if(key.equals(lc))
				return true;
		}
		return false;
	}

	public static void print(int roomsX, int roomsY, int posX, int posY) {
		for (int j = 0; j != roomsX; j++) {
			System.out.print("____");
		}
		System.out.println();

		for (int i = 0; i != roomsY; i++) {
			for (int j = 3; j > 0; j--) {
				for (int k = 0; k != roomsX; k++) {
					if (j == 1) {
						System.out.print("|___");
					} else {
						if (j == 2 && i == posX && k == posY) {
							System.out.print("| X ");
						} else {
							System.out.print("|   ");
						}
					}
				}
				System.out.println("|");
			}
		}
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
