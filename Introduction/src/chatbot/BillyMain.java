package chatbot;

import java.util.Scanner;

public class BillyMain {
	
		static Scanner input;
		static String user;
		static boolean inLoop;
		static String response;
		static Topic school;

		public static void main(String[] args) {
			createTopics();
			promptName();
			talkForever();

		}

		public static void promptName() {
			print("Hello, human! I am a board covered with semiconductors\n and other such electronic components, What is your name?");
			// /n makes the line break
			user = input.nextLine(); //user referencing the field user
			print("Hello "+ user);
		}

		public static void talkForever() {
			inLoop = true;
			while(inLoop){ //what ever is inside the while loop is true, it keeps running
				//promptInput();
				print("Greetings, "+user+". How are you?");
				response = getInput();
				if (findKeyword(response, "good", 0) >=0){
					print("I'm so happy you're good");
				}
				else if(response.indexOf("school")>=0){
					inLoop =false;//exits the loop
					school.talk();//calls on the school class
				}
				else
					print("Im sorry i dont understand you");
			}
		}

		public static boolean findKeyword(String searchString, String key, int startIndex) {
			String phrase = searchString.trim();//delete white space
			//set all letters lowerCase
			phrase = phrase.toLowerCase();
			key = key.toLowerCase();
			int psn = phrase.indexOf(key);
			//keep checking for key word until context is found
			while (psn>=0){
				String before=" ";
				String after = " ";
				if(psn + key.length() <phrase.length()){ //checks if the key is at the end of the sentence
					after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
				}
				if(psn>0){
					before = phrase.substring(psn-1,psn).toLowerCase();
				}
				if(before.compareTo("a")<0 && after.compareTo("a")<0){
					return true;
				}
				//if keyword is not found yet, check the rest of the string
				psn = phrase.indexOf(key,psn+1);
			}
			
			return false;
		}

		public static void promptInput() {
			print(user+" Try inputing a string");
			String userInput = input.nextLine();
			print("You typed "+userInput);

		}
		
		public static String getInput(){
			return input.nextLine();
		}

		public static void print(String s){
			String printString = "";
			//loop to count the worlds per line
			int cutOff = 35;
			while(s.length() > 0){
				String currentLine = "";
				String nextWord = "";
				//while the current line and next word are less than 35(cutoff) & there are still words to add, do the following
				while(currentLine.length()+nextWord.length()<=cutOff && s.length() > 0){
					//add next word to the line
					currentLine += nextWord;
					//remove the word added
					s = s.substring(nextWord.length());
					int endOfWord = s.indexOf(" "); //check to see if this is last word
					if(endOfWord == -1){
						endOfWord = s.length()-1;
					}
					nextWord = s.substring(0,endOfWord+1);
				}
				printString += currentLine + "\n";
			}
			System.out.println(printString);
			//		lineCount++ ;
			//		print("Line #: " + lineCount+" "+s);//don't need this line, can use print() instead
		}


		public static void createTopics() {
			input = new Scanner(System.in);//allows for user input
			school = new School();

		}

	}
