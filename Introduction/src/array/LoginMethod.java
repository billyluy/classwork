package array;

import java.util.Scanner;

public class LoginMethod {
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1point "private" or inaccessible
	//1point for declaration of data type(String)
	public static String username = "test_user";
	public static String password = "test";
	
	public static void main(String[] args) {
		if(correctUser()){
			askPassword();
		}
		else
			System.out.println("Unkown user name, please contact network administator");
	}

	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		while(inLoop){
			System.out.println("Enter password");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("you are in");
				inLoop = false;
			}
			else{
				remainingTries--;
				if(remainingTries == 0){
					System.out.println("invalid password");
					inLoop = false;
				}
				else
					System.out.println("incorrect password you have "+remainingTries+" chances left");
			}
		}
	}

	private static boolean correctUser() {
		System.out.println("enter username");
		return (waitForEntry().equals(username));
	}

}
