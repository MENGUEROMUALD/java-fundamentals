package org.toubou;

import java.util.Scanner;

public class Lesson7Ass1 {

	 public static int fact (int n) {
	        if (n==0) return(1);
	        else return(n*fact(n-1));
	 }
	 public static void main (String[] args) {

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a n:");
			int n=input.nextInt();
	       System.out.print(fact(n));
	        System.out.print("\n");
	    }
}

