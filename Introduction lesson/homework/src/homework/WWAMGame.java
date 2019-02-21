package homework;

public class WWAMGame {
	
	/*
	 * String[] question; String[] answer; int a;
	 */
	
	String question; 
	String answer; 
	float score;
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}

	public float getScore() {
		return score;
	}
	
	public boolean validateAnswer(String useranswer) {
		return this.answer.equalsIgnoreCase(useranswer);
	}
	
	
	
	public WWAMGame(String question, String answer, float score) {
		this.question = question;
		this.answer = answer;
		this.score = score;
	}
	

}
