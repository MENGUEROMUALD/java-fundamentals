package homework;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class WhoWinsAMillionbase {
	
	
	
	public static long elapsedTime;
	String username;
	float totalScore = 0;
	float prizeMoney = 0;
	int correctQuestions = 0;
	int numberOfQUestions;
	Formatter starttime;
	
	Formatter time = new Formatter();
	
	public void setStarttime() {
		time.format("%tr", Calendar.getInstance());
		 System.out.println("The time now is "+time.toString());
		 this.starttime = starttime;
	}
	public Formatter getStarttime() {
		return starttime;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}
	public float getTotalScore() {
		return totalScore;
	}
	public void setPrizeMoney(float prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	public float getPrizeMoney() {
		return prizeMoney;
	}
	public void setCorrectQuestions(int correctQuestions) {
		
		if(correctQuestions<0) {
			this.correctQuestions = 0;
		}
		else {
			this.correctQuestions = correctQuestions;
		}
		
	}
	public int getCorrectQuestions() {
		return correctQuestions;
	}
	public void setNumberOfQUestions(int num) {
		numberOfQUestions = num;;
	}
	public int getNumberOfQUestions() {
		return numberOfQUestions;
	}
	public WhoWinsAMillionbase() {
		
	}
	public WhoWinsAMillionbase(String username) {
		this.username = username;
		
	}
	

}
