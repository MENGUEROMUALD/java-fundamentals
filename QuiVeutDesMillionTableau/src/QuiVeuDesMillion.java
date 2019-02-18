import java.util.Scanner;

public class QuiVeuDesMillion {

	public static void main(String[] args) {
		QuestionTableau questionTableau = new QuestionTableau();
		questionTableau.question();
		System.out.println("voulez vous rejouer ?");
		System.out.println("1- rejouer 2- sortir");
		Scanner input = new Scanner (System.in);
		int i =input.nextInt();
		if(i==2) {
			System.out.println("merci d'avoir jouer");
			}
		while(i==1) {
					questionTableau.question();
			}
	}	
}
