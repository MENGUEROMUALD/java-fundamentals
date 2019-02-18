import java.util.Scanner;

public class QuestionTableau {
	public void question() {
		System.out.println("************bienvenue sur qui veux gagner des million*************");
		Scanner input=new Scanner(System.in);
		System.out.println("quel est votre nom ?");
		String name =input.nextLine();
		System.out.println("bien Mr "+name+"jouons, mais sachez qu'une seule mauvaise reponse entraine l'arret du jeux :) et vous perdrez tout vos gain, pret allons s'y");
		Player player = new Player(name, 0,0, 0);
		boolean answer =true;
		while(answer == true) {
			System.out.println("ok "+name +" Question une , qui etait neslson mandela ?");
			String[] questionOne = {"un politicien","un bandit","une marque de biere"};
			for(int i =0;i<questionOne.length;i++) {
				System.out.println(questionOne[i]);
			}
			String firstAnswer =input.nextLine();
			String[] reponse = {firstAnswer};
			if(reponse[0].equals(questionOne[0])) {
				System.out.println("correct");
				player.setPriceMoney(10000);
				player.setTotal_score(10);
				player.setCorrectQuestion(1);
				System.out.println("argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getCorrectQuestion());
			}else {
				System.out.println("votre reponse en incorrect");
				player.setPriceMoney(0);
				player.setTotal_score(0);
				player.setCorrectQuestion(0);
				System.out.println("argent "+player.getPriceMoney()+"score "+ player.getTotal_score()+"reponse correcte "+player.getPriceMoney());
				break;
			}
			System.out.println(name +"Question deux , qui a gagner les election au cameroun en 2018 ?");
			String[] questionTwo = {"paul biya","maurice kamto","joshua osih"};
			for(int i =0;i<questionTwo.length;i++) {
				System.out.println(questionTwo[i]);
			}
			String secondAnswer =input.nextLine();
			String[] reponseDeux = {secondAnswer};
			if(reponseDeux[0].equals(questionTwo[1])) {
				System.out.println("correct");
				player.setPriceMoney(20000);
				player.setTotal_score(20);
				player.setCorrectQuestion(2);
				System.out.println("argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getCorrectQuestion());
			}else {
				System.out.println("votre reponse en incorrect");
				player.setPriceMoney(-20000);
				player.setTotal_score(0);
				player.setCorrectQuestion(0);
				System.out.println("argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+"reponse correcte "+player.getPriceMoney());
				break;
			}
			System.out.println(name +"Question trois , quel est le meilleur prof du monde ?");
			String[] questionThree = {"mr akah","mr kamdjou","kim kardashian"};
			for(int i =0;i<questionThree.length;i++) {
				System.out.println(questionThree[i]);
			}
			String thirdAnswer =input.nextLine();
			String[] reponseTrois = {thirdAnswer};
			if(reponseTrois[0].equals(questionThree[0])) {
				System.out.println("correct");
				player.setPriceMoney(30000);
				player.setTotal_score(30);
				player.setCorrectQuestion(3);
				System.out.println("argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getCorrectQuestion());
			}else {
				System.out.println("votre reponse en incorrect");
				player.setPriceMoney(-20000);
				player.setTotal_score(0);
				player.setCorrectQuestion(0);
				System.out.println(" argent "+player.getPriceMoney()+" score "+ player.getTotal_score()+" reponse correcte "+player.getPriceMoney());
				break;
			}

				}
			}

}
