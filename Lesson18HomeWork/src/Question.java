import java.io.IOException;
import java.util.Scanner;

public class Question {
	
	public void question() {
		MillionSerialization data = new MillionSerialization();
		System.out.println("************bienvenue sur qui veux gagner des million*************");
		Scanner input=new Scanner(System.in);
		System.out.println("quel est votre nom ?");
		String name =input.nextLine();
		System.out.println("bien Mr "+name+" jouons, mais sachez qu'une seule mauvaise reponse entraine l'arret du jeux :) , pret allons s'y");
		Player player = new Player(name, 0,0, 0);
		boolean answer =true;
		while(answer == true) {
		System.out.println("ok "+name +" Question une , qui etait neslson mandela ?");
		System.out.println("1-un politicien 2-un bandit 3-une marque de biere");
		int first =input.nextInt();
		if(first==1) {
			System.out.println("correct");
			player.setPriceMoney(10000);
			player.setTotal_score(10);
			player.setCorrectQuestion(1);
		}else {
			System.out.println(" votre reponse en incorrect");
			player.setPriceMoney(0);
			player.setTotal_score(0);
			player.setCorrectQuestion(0);
			System.out.println("argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getPriceMoney());
			try {
				data.serialize( player.getTotal_score(), player.getUser_name());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		System.out.println(name +" Question deux , qui a gagner les election au cameroun en 2018 ?");
		System.out.println("1-paul biya 2-maurice kamto 3-joshua osih");
		int second =input.nextInt();
	if(second==2) {
		System.out.println("correct");
		player.setPriceMoney(20000);
		player.setTotal_score(20);
		player.setCorrectQuestion(2);
	}else {
		System.out.println("votre reponse en incorrect");
		player.setPriceMoney(-20000);
		player.setTotal_score(0);
		player.setCorrectQuestion(0);
		System.out.println("argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getPriceMoney());
		try {
			data.serialize( player.getTotal_score(), player.getUser_name());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	}
	System.out.println(name +"Question trois , quel est le meilleur prof du monde ?");
	System.out.println("1-Einstein 2-mr akah 3-kings");
	int third =input.nextInt();
	if(third==2) {
		System.out.println("correct");
		player.setPriceMoney(30000);
		player.setTotal_score(30);
		player.setCorrectQuestion(3);
		try {
			data.serialize( player.getTotal_score(), player.getUser_name());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	}else {
		System.out.println("votre reponse en incorrect");
		player.setPriceMoney(-3000);
		player.setTotal_score(0);
		player.setCorrectQuestion(0);
		System.out.println("argent "+ player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getPriceMoney());
		try {
			data.serialize( player.getTotal_score(), player.getUser_name());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		break;
		
		}

		}
		
		
			}
	
	}