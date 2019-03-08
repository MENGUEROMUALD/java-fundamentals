package homework;

import java.util.Calendar;
import java.util.Scanner;

public class WhoWinsAMillionbase {
	
	
	
	String username;
	float totalScore = 0;
	float prizeMoney = 0;
	int correctQuestions = 0;
	int numberOfQUestions;
	String starttime;
	int howlong;
	
	
	
	
	public void setStarttime() {
		Calendar cal = Calendar.getInstance();
		System.out.println(
				String.format("current time %02d:%02d:%02d", cal.get(Calendar.HOUR_OF_DAY) ,
						cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND)));
		
		this.starttime = starttime;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setHowlong(int howlong) {
			
	}
	public int getHowlong() {
		return howlong;
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
