package ExerciceTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	public void playGame() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("welcoome to casiino");
		System.out.println("How mani time do you want to get the game");
		System.out.println("first player enter your name");
		String playerOneName=input.nextLine();
		System.out.println("Second player enter your name");
		String playertwoName=input.nextLine();
		Player firstPlayer = new Player(playerOneName, 0, 0);
		Player secondPlayer = new Player(playertwoName, 0, 0);
		System.out.println("how many turn do you want");
		int TourDeJeux= input.nextInt();
		int lancer=0;
		
		while(lancer<=TourDeJeux*2) {
		System.out.println("playerOne turn");
		System.out.println("press 1 to play " +playerOneName);
		int jeu = input.nextInt();
		int i=0;
		if(jeu==1) {
		Random ran= new Random();
		int side1=ran.nextInt(6-1)+1;
		i=side1;
		System.out.println(side1);
		}
		secondPlayer.setScore(i);
		System.out.println("playerTwo turn");
		System.out.println("press 1 to play " +playertwoName);
		int jeu1 = input.nextInt();
		int a=0;
		if(jeu1==1) {
		Random ran= new Random();
		int side1=ran.nextInt(6-1)+1;
		a=side1;
		System.out.println(side1);
		}
		firstPlayer.setScore(a);
		
		System.out.println("turn "+ ++lancer);	
		}
		
		if(firstPlayer.score<secondPlayer.score) {
			System.out.println("the Winner is : "+ secondPlayer.name+" with " + secondPlayer.score);
			winner(secondPlayer.name,secondPlayer.id,secondPlayer.score);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			System.out.println(date);
		}else {
			System.out.println("the Winner is : "+ firstPlayer.name+"  with "+ firstPlayer.score );
			winner(firstPlayer.name,firstPlayer.id,firstPlayer.score);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			System.out.println(date);
		}
		System.out.println("game Finish");
		
		
	}
	public Connection GetConnexion() {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost/3306/CasinoGame";
		String user="root";
		String password="";
		Connection cnx=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.getMessage();
		}
		Connection cnx = null;;
		return cnx;
		
	}
	public void winner(String name,int id,int score) {
		Connection con =GetConnexion();
		Statement st;
		ResultSet rst;
		//con=st.createStatement;
		//rst.execute("insert into casinoPlayer values("+name+""+id+ ""+score+")");
	}
}
