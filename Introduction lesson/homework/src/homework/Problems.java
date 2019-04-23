package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problems {

	public static void main(String[] args) {
	
		
		int b = Problems.reverse(131);
		int c = Problems.reverse(221);
		System.out.println(b+""+c);
		
	// method to reverse intergers.
	}
	public static int reverse(int num) {
		int reversed = 0;
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num/=10;
		}
		return reversed;
	}
}
