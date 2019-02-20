package homework;
import java.util.Scanner;

public class WhoWinsAMillion {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*String a = "Who is the President of Cameroon? ";
		String a1= "Paul Biya";
		String b = "How many colors on the Cameroon flag? ";
		int  b1 = 3;
		String c = "In which town is Mount Cameroon? ";
		String c1= "Buea";
		String d = "How many regions in Cameroon? ";
		int d1 = 10;
		*/
		
		/*
		 * WhoWinsAMillionbase game = new WhoWinsAMillionbase();
		 * System.out.println("Please enter a Username : "); String un =
		 * input.nextLine(); game.setUsername(un);
		 * System.out.println("Welcome to WinAMillion game "+game.getUsername());
		 * System.out.println(" Please answer the following questions ");
		 * System.out.println(" ");
		 */
		
		WWAMGame Play = new WWAMGame();
		System.out.println("PLEASE ENTER PLAYER1 NAME : ");
		String player1 = input.nextLine();
		System.out.println("PLEASE ENTER PLAYER2 NAME : ");
		String player2 = input.nextLine();
		System.out.println("WELCOME "+player1+" AND "+player2+" TO WHO WINS A MILLION GAME");
		
		Play.getQuestion(); 
		
		
	/*	int sum= 0;
		System.out.println(a);
		String A = input.nextLine();
		if(A.equalsIgnoreCase(a1)){ ++sum;
			System.out.println("Correct");
			sum++; 
		}else System.out.println("Wrong Answer");
			sum--; 
			
		System.out.println(" ");
		
		System.out.println(c);
		String C = input.nextLine();
		if(C.equalsIgnoreCase(c1)) {++sum;
			System.out.println("Correct");
			sum++;
		}else System.out.println("Wrong Answer");
		sum--; 
		System.out.println(" ");
		
		System.out.println(b);
		int B = input.nextInt();
		if(B == b1) {++sum;
			System.out.println("Correct");
			sum++;
		}else  System.out.println("Wrong Answer");
				sum--; 
				
		System.out.println(" ");
		
		System.out.println(d);
		int D = input.nextInt();
		if(D == d1) {++sum;
			System.out.println("Correct");
			sum++;
		}else System.out.println("Wrong Answer");
			sum--;*/
				
		
		/*
		 * System.out.println(" ");
		 * System.out.println(game.getUsername()+" Your total Score = "+sum);
		 */
	
		
	

	}
}
