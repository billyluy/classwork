package chatbot;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolResponse;

	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			BillyMain.print("Tell me about school.");
			schoolResponse = BillyMain.getInput();
			if(schoolResponse.indexOf("stop")>=0){
				inSchoolLoop = false; //exits the school class and goes back to main class
				BillyMain.talkForever();
			}
			BillyMain.print("That's my favorite part about school too.");
		}

	}

	public boolean isTriggered(String userInput) {
		//String[] triggers = ("school", "class", "teacher", "grades");
		//you can use a for loop to loop through a array
		if(BillyMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(BillyMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}

}
