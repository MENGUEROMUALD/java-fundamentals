package homework;
import java.util.Scanner;

public class lesson5assignment1 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		int numb1, numb2;
		System.out.println("Enter 2 positive numbers : ");
		numb1=user.nextInt();
		while(numb1 <= 0) {//While or do while loop to break when first input is 0
		if(numb1 >=1)continue;
		if(numb1 <= 0)return;
		}
		numb2=user.nextInt();
		System.out.println("Addition = "+(numb1 + numb2));
		System.out.println("Subraction = "+(numb1 - numb2));
		System.out.println("Multiplication = "+(numb1 * numb2));
		System.out.println("Division = "+(numb1 / numb2));
		System.out.println("Exponential = "+(numb1 ^ numb2));
		// program should end when 0 is entered for first number.
		
	}

}
