package homework;
import java.util.Scanner;
public class Fibonacciassignment {

	public static void main(String[] args) {
		boolean v = true;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Type in a number :");
			int A = input.nextInt();
				long var=Lesson7base.fab(A);
				System.out.println(var);
			
		}while(v);
		
	}
	

}
