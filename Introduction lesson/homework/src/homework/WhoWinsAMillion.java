package homework;
import java.util.Scanner;
import java.util.Calendar;

public class WhoWinsAMillion {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("PLEASE ENTER PLAYER1 NAME : ");
		String player = input.nextLine();
		WhoWinsAMillionbase player1 = new WhoWinsAMillionbase(player);
		System.out.println("PLEASE ENTER PLAYER2 NAME : ");
		player = input.nextLine();		
		WhoWinsAMillionbase player2 = new WhoWinsAMillionbase(player);
		
        System.out.println("WELCOME "+player1.getUsername()+" AND "+player2.getUsername()+" TO WHO WINS A MILLION GAME");
        WhoWinsAMillionbase[] players = new WhoWinsAMillionbase[2];
        players[0] = player1;
        players[1] = player2;
        
        long time1 = 0;
		long time2 = 0;
		long[] time = {time1, time2};
        
		
		WWAMGame[] questions = new WWAMGame[5];
		
			questions[0]= new WWAMGame("Who is the president of cameroon?", "Paul Biya", 1);
			questions[1]= new WWAMGame("How many colors on the cameroon flag?", "3", 1);
			questions[2]= new WWAMGame("In which town is mount cameroon?", "Buea", 1);
			questions[3]= new WWAMGame("How many regions are there in cameroon?", "10", 1);
			questions[4]= new WWAMGame("What is the capital of cameroon?", "Yaounde", 1);
			
			System.out.println("");
			
			for(int j =0; j<players.length;j++) {
				System.out.println(players[j].getUsername() + " is your turn.");
				
			
				time[j] = System.currentTimeMillis();
				long elapsedTime = 0;
				players[j].setStarttime();
				System.out.println("");
				
				
			for(int i=0; i<questions.length; i++) {
				
				 WWAMGame ques = questions[i];
				System.out.println(ques.getQuestion());
				String ans = input.nextLine();
				players[j].setNumberOfQUestions(i+1);
				
				if(ques.validateAnswer(ans)) {
					System.out.println("Correct");
					players[j].setTotalScore(players[j].getTotalScore() + ques.getScore());
					players[j].setCorrectQuestions(players[j].getCorrectQuestions() + 1 );
					players[j].setPrizeMoney(players[j].getPrizeMoney() + 2);
				}
				else {
					System.out.println("Wrong Answer");
					players[j].setTotalScore(players[j].getTotalScore() - ques.getScore());
					if(players[j].getTotalScore() < 0) break;
				}
				
			 }
			players[j].elapsedTime = System.currentTimeMillis();
			System.out.println("");
			}
			
			 System.out.println(players[0].getUsername() + ",\nYour total Score = " + players[0].getTotalScore()
			 + "\nNumber of question attempted: " + players[0].getNumberOfQUestions()
			 + "\nNumber of correct question: " + players[0].getCorrectQuestions()
			 + "\nYour Prize is: " + players[0].getPrizeMoney()
			 + "\nYour total time is: " + ((players[0].elapsedTime - time[0])/1000+" seconds"));
			 System.out.println("");
			 
			 System.out.println(players[1].getUsername() + ",\nYour total Score = " + players[1].getTotalScore()
					 + "\nNumber of question attempted: " + players[1].getNumberOfQUestions()
					 + "\nNumber of correct question: " + players[1].getCorrectQuestions()
					 + "\nYour Prize is: " + players[1].getPrizeMoney()
					 + "\nYour total time is: " + ((players[1].elapsedTime - time[1])/1000+" seconds"));
			 
	}
}
