package org.toubou;

import java.util.Scanner;

public class Lesson7Ass2 {

	public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a n:");
		int n=input.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
}
