package homework;
import java.util.Scanner;

public class Lesson7base {

	public static double add(int a, float b) {
		return a + b;
	}
	int fac = 1;
	Scanner input = new Scanner(System.in);
	
	public int fact() {
		System.out.println("Type in a number : ");
		int x = input.nextInt();
		int n = 1;
		for(int f = x; f >= 2;f--) {
			System.out.print(f+" x ");
			n*=f;	
		}
		System.out.print(1+" = "+n);
		return n;
	}
	
	/*
	 * public double Fab() { System.out.println("Enter a number "); int a = 1; int b
	 * = 1; int c = 0; int n = input.nextInt(); System.out.print("1 1 "); while
	 * (c<=n) { c = a + b; System.out.print(c+" "); a = b; b = c; }
	 * System.out.println();
	 * System.out.println("The "+n+"th Fibonacci number is "+c); return c; }
	 */

	public static long fab(int n) {
		if (n==0) {
			return 0;
		}
		if (n<=2) {
			return 1;
		}
		return fab(n-1) + fab(n-2);
	}
}
