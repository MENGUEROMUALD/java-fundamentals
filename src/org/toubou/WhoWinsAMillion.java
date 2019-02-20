package org.toubou;

import java.util.Scanner;

public class WhoWinsAMillion {

	String username;
	static int totalScore=0;
	static float prizeMoney=0.0f;
	static int correctQuestions=0;
	public static final float AMOUNT_PER_SCORE=500f;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static int getTotalScore() {
		return totalScore;
	}

	public static void setTotalScore(int totalScore) {
		WhoWinsAMillion.totalScore = totalScore;
	}

	public float getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(float prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	public int getCorrectQuestions() {
		return correctQuestions;
	}

	public void setCorrectQuestions(int correctQuestions) {
		this.correctQuestions = correctQuestions;
	}
   
	public static void play(String[] questions,String[] answers) {
		int nbreQestions=0;
		for (int i=0;i<questions.length;i++) {
        	Scanner input1 = new Scanner(System.in);
        	System.out.println("question:\n" +questions[i]);
        	System.out.println("answer: ");
        	String answer = input1.next();
        	if ((answer.toUpperCase()).equals((answers[i]).toUpperCase())) {
        		++totalScore;
        		++correctQuestions;
        		++nbreQestions;
        	}
        	else {
        		--totalScore;
        		++nbreQestions;
        	}
        	if (totalScore<0) {
        		System.out.println("Game over!!!!");
        		break;
        	}
        }
        prizeMoney=(float)totalScore*correctQuestions*AMOUNT_PER_SCORE;
        
        System.out.println("Total questions attempted: "+nbreQestions);
        System.out.println("Total score: " +totalScore);
        System.out.println("Total prize money obtained: "+prizeMoney);
        System.out.println("Total correct answers: " +correctQuestions);
        
	}
}