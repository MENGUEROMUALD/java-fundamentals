package homework;
import java.util.Scanner;

public class WhoWinsAMillion {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = "Who is the President of Cameroon? ";
		String b = "How many colors on the Cameroon flag? ";
		String c = "In which town is Mount Cameroon? ";
		String d = "How many regions in Cameroon? ";
		
		
		WhoWinsAMillionbase game = new WhoWinsAMillionbase();
		System.out.println("Please enter a Username : ");
		String un = input.nextLine();
		game.setUsername(un);
		System.out.println("Welcome to WinAMillion game "+game.getUsername());
		System.out.println(" ");
		
		System.out.println(a);
		String A = input.nextLine();
		boolean t = A.equalsIgnoreCase("Paul Biya");
		System.out.println(t);
		System.out.println(" ");
		
		System.out.println(c);
		String C = input.nextLine();
		boolean r = C.equalsIgnoreCase("Buea");
		System.out.println(r);
		System.out.println(" ");
		
		System.out.println(b);
		int B = input.nextInt();
		if(B == 3) {
			System.out.println("Correct");
		}
			else System.out.println("Wrong Answer");
		System.out.println(" ");
		
		System.out.println(d);
		int D = input.nextInt();
		if(D == 10) {
			System.out.println("Correct");
		}
			else System.out.println("Wrong Answer");
		System.out.println(" ");
		
		
		
		
		

	}

}
