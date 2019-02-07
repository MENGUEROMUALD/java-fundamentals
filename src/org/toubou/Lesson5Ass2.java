package org.toubou;

import java.util.Scanner;

public class Lesson5Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=0,z=0;
		String sum="0";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a x:");
		int x = input.nextInt(); // reads a string from the user as input 
		System.out.println("You entered x: " +x);
		for(int i=1;i<=x;i++) {
			z=z+i;
			sum=sum +"+"+i;
		}
			System.out.println("sum of "+sum +" is " +z);
		
	}

}
