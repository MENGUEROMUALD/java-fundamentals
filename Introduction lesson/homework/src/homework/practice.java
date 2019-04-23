package homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
		String name = "Uduma", heshe ="";
		double gpa = 2.4;
		int age =35, retirement = 70, daystill =0;
		boolean isFemale;
		
		System.out.print("Enter name : ");
		name = input.nextLine();
		System.out.print("Enter age : ");
		age = input.nextInt();
		System.out.print("Enter gpa : ");
		gpa = input.nextDouble();
		System.out.print("Are you Female? (true/false) : ");
		isFemale = input.nextBoolean();
		heshe = isFemale ? "She" : "He";
		daystill = retirement - age;
		
		System.out.printf("%s is %d years old. %s has %d years to retirement. %s has a %4.3f gpa.\n", 
				name, age, heshe, daystill, heshe, gpa);*/

		int[] x = {1,2,4,8,18,38};
		int[] y = {1,2,3,4,5,6};
		
		incA(x,3);
	}

	public static void incA(int[] c, int n) {
		int sum = 0;
		for(int i = 0; i < c[n-1]; i++) 
			System.out.println(c[i]);
			//sum+=i;
		//System.out.println(sum);
			/*if (c[n] > sum) 
				System.out.println("This is an increasing Array");	
		else
			System.out.println("This in not and increasing Array");
*/	}
}
