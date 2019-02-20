package homework;
import java.util.Scanner;
public class Fibonacciassignment {

	public static void main(String[] args) {
		
		
		
		Lesson7base Fact = new Lesson7base();
		Fact.fact();
		System.out.println(" ");
		
			Scanner input = new Scanner(System.in);
			System.out.println("Type in a number :");
			int A = input.nextInt();
				long var=Lesson7base.fab(A);
				System.out.println(var);
		
	}
	

}
