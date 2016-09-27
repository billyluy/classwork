package chatbot;

public class BillyLike implements Topic {
	
	private boolean inLikeLoop;
	private String likeResponse;

	public void talk() {
		BillyMain.print("What are some things you like?");
		inLikeLoop = true;
		while (inLikeLoop){
			likeResponse = BillyMain.getInput();
			int likePsn= BillyMain.findKeyword(likeResponse, "like", 0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn+5);
				BillyMain.print("You are such an interesting person because you like "+thingsLiked);
				if(BillyMain.findKeyword(thingsLiked, "school", 0)>=0){
					inLikeLoop = false;
					BillyMain.school.talk();
				}
				else{
				inLikeLoop = false;
				BillyMain.talkForever();
				}
			}
			else
				BillyMain.print("I dont understand you ");
		}
	}
	

}
