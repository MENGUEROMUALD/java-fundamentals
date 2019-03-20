import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Question {
	String playername;
	Player player = new Player(playername, 0,0, 0);
	public void question() {
		System.out.println("************bienvenue sur qui veux gagner des million*************");
		Scanner input=new Scanner(System.in);
		System.out.println("quel est votre nom ?");
		String name =input.nextLine();
		playername=name;
		System.out.println("bien Mr "+name+"jouons, mais sachez qu'une seule mauvaise reponse entraine l'arret du jeux :) , pret allons s'y");
		
		boolean answer =true;
		while(answer == true) {
		System.out.println("ok "+name +"Question une , qui etait neslson mandela ?");
		System.out.println("1-un politicien 2-un bandit 3-une marque de biere");
		int first =input.nextInt();
		if(first==1) {
			System.out.println("correct");
			player.setPriceMoney(10000);
			player.setTotal_score(10);
			player.setCorrectQuestion(1);
		}else {
			System.out.println("votre reponse en incorrect");
			player.setPriceMoney(0);
			player.setTotal_score(0);
			player.setCorrectQuestion(0);
			System.out.println("argent "+player.getPriceMoney()+"score "+ player.getTotal_score()+"reponse correcte "+player.getPriceMoney());
			break;
		}
		System.out.println(name +"Question deux , qui a gagner les election au cameroun en 2018 ?");
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
		System.out.println("argent "+player.getPriceMoney()+"score "+ player.getTotal_score()+"reponse correcte "+player.getPriceMoney());
		break;
	}
	System.out.println(name +"Question trois , quel est le meilleur prof du monde ?");
	System.out.println("1-paul biya 2-maurice kamto 3-joshua osih");
	int third =input.nextInt();
	if(third==2) {
		System.out.println("correct");
		player.setPriceMoney(30000);
		player.setTotal_score(30);
		player.setCorrectQuestion(3);
	}else {
		System.out.println("votre reponse en incorrect");
		player.setPriceMoney(-3000);
		player.setTotal_score(0);
		player.setCorrectQuestion(0);
		System.out.println("argent "+ player.getPriceMoney()+"score "+ player.getTotal_score()+"reponse correcte "+player.getPriceMoney());
		
		break;
		
		}

		}
			}
	String fileDestination ="millionData.txt";
	public void serialize() throws IOException {
		player.total_score=player.getTotal_score();
		player.user_name=player.getUser_name();
		try {
			File mfile = new File(fileDestination);
			if(!mfile.exists()) {
				mfile.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(mfile);
			ObjectOutputStream ous=new ObjectOutputStream(fos);
			ous.writeObject(player);
			ous.flush();
			ous.close();
			fos.close();
		}catch(FileNotFoundException e) {
			
		}
	}
	public void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileDestination);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Player game = (Player) ois.readObject();
		System.out.println("deserialization object");
		System.out.println(game.toString());
		ois.close();
		fis.close();
		System.out.println("le precedent a eu comme score :");
		System.out.println(game.getUser_name());
		System.out.println(game.getTotal_score());
	}

}
