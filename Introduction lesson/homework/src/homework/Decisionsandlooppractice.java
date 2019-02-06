package homework;

import java.util.Scanner;

public class Decisionsandlooppractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sales;
		double commission;
		System.out.println("Enter sales : ");
		sales = input.nextInt();
		String name;
		
		input.nextLine();
		System.out.println("Enter your name : ");
		name = input.nextLine();
		if (sales >=1 && sales <=1000) {
			commission = .02;
		}
		else if (sales >=1001 && sales <=10000) {
			commission = .04;
		}
		else{
			commission = .10;
		}
		System.out.println("The commission is : "+ commission);
		System.out.println("Thanks, "+name);
		
		//loops
		
		int x = 1;
		while (x <=10) {
		System.out.println(x);
		x=x+1; //prints out 1 to 10 and exits when its 11
		}
		
		//The next asks the user for 5 numbers and prints the average of the numbers
		int c = 1;
		double score, total, avg;
		total=0;
		while (c <= 5) {
		score= input.nextDouble();
		total = total + score;
		c = c + 1;
		avg = total/ (c-1);
		System.out.println("The average = "+avg);
		}
		//For loop
		int p;
		for (p=1; p<=10; p=p+2) {
		System.out.println(p);
		}
		System.out.println(p);
	}
	}
		



