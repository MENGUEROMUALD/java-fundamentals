package homework;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
				name, age, heshe, daystill, heshe, gpa);
	

	}

}
