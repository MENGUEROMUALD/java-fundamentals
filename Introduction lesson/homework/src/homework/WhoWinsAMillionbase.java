package homework;


import java.util.Scanner;

public class WhoWinsAMillionbase {
	
	String Username;
	int totalScore;
	float prizeMoney;
	short correctQuestions;
	
	public void setUsername(String username) {
		Username = username;
	}
	public String getUsername() {
		return Username;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setPrizeMoney(float prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	public float getPrizeMoney() {
		return prizeMoney;
	}
	public void setCorrectQuestions(short correctQuestions) {
		this.correctQuestions = correctQuestions;
	}
	public short getCorrectQuestions() {
		return correctQuestions;
	}
	public WhoWinsAMillionbase() {
		
	}

}
