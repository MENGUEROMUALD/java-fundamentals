package homework;

public class WWAMGame {
	
	String[] question;
	String[] answer;
	int a;
	
	
	public String[] getQuestion() {
		question[0]= "Who is the president of cameroon?";
		question[1]="How many colors on the cameroon flag?";
		question[2]="In which town is mount cameroon?";
		question[3]="How many regions are there in cameroon?";
		question[4]="What is the capital of cameroon?";
		for (int a = 0; a < 6; a++);
		System.out.println(question[a]);
		return question;
	}
	public String[] getAnswer(String []answer) {
		answer[0]="Paul Biya";
		answer[1]="3";
		answer[2]="Buea";
		answer[3]="10";
		answer[4]="Yaounde";
		return answer;
	}
	
	public WWAMGame() {
		this.question = question;
		this.answer = answer;
	}
	
	

}
