import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Player {
	public String user_name;
	int total_score;
	int priceMoney ;
	int CorrectQuestion;
	public Player(String user_name, int total_score, int priceMoney, int correctQuestion) {
		super();
		this.user_name = user_name;
		this.total_score = total_score;
		this.priceMoney = priceMoney;
		CorrectQuestion = correctQuestion;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getTotal_score() {
		return total_score;
	}
	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}
	public int getPriceMoney() {
		return priceMoney;
	}
	public void setPriceMoney(int priceMoney) {
		this.priceMoney = priceMoney;
	}
	public int getCorrectQuestion() {
		return CorrectQuestion;
	}
	public void setCorrectQuestion(int correctQuestion) {
		CorrectQuestion = correctQuestion;
	}
	
	

}
