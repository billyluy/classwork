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
				inSchoolLoop = false;
				BillyMain.talkForever();
			}
			BillyMain.print("That's my favorite part about school too.");
		}

	}

}
