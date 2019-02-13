package homework;
import java.util.Scanner;

public class Factorialassignment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		int x;
		System.out.println("Type in a number : ");
		x = input.nextInt();
		int mult = 1;
		for(int fact = x; fact > 1;fact--) {
			System.out.print(fact+" x ");
			mult = mult * (fact);
		}
		System.out.println((1)+" = "+(mult));
		System.out.println("The factorial of "+x+" = "+(mult));

		/*
		 * Lesson7base Factorial = new Lesson7base();
		 * System.out.println(Factorial.fact());
		 * 
		 * Lesson7base Fabonacci = Factorial; System.out.println(Fabonacci.Fab());
		 */
	}

}
