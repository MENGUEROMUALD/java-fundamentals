/**
 * @author Mas73rs
 *
 */
/**
 * @description
 * A program that asks the user to enter a number
 * and sums the numbers from 0 to the user's number
 */




package loopAssignments;

import java.util.Scanner;

public class AddingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			


		int max;
		int sum = 0;
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your max : ");
		max = input.nextInt();
		
		for(int i = 0;i <= max;i++) {
			sum+=i;
		}
		System.out.println("Sum of numbers between 1 and "+max+" is "+sum);
	}

}
