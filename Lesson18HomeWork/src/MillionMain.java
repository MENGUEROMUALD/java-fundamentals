import java.io.IOException;
import java.util.Scanner;

public class MillionMain {

	public static void main(String[] args) {
		MillionSerialization data = new MillionSerialization();
		try {
			data.deserialization();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		Question questionTableau = new Question();
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
