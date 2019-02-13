package homework;
import java.util.Scanner;

public class WhoWinsAMillion {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = "Who is the President of Cameroon? ";
		String b = "How many colors on the Cameroon flag? ";
		String c = "In which town is Mount Cameroon? ";
		String d = "How many regions in Cameroon? ";
		String e = "What is the capital of Cameroon? ";
		
		WhoWinsAMillionbase game = new WhoWinsAMillionbase();
		System.out.println("Please enter a Username : ");
		String un = input.nextLine();
		game.setUsername(un);
		System.out.println("Welcome to WinAMillion game "+game.getUsername());
		System.out.println(" ");
		System.out.println("Rules: For every correct answer is a point and wrong answer is minus a point");
		System.out.println("If you have a minus score the game ends");
		System.out.println(" ");
		
		
		
		
		

	}

}
