package homework;

public class Exercise16 {

	public static void main(String[] args) {
		
		String b ="ababa";
		StringBuilder sb = new StringBuilder(b);
		
		System.out.printf("Original string is : %s\n ",sb.toString());
		System.out.printf("Reversed String is : %s\n ",sb.reverse());
		System.out.println(sb.toString());
		
		if(sb.toString().equals(b))
			System.out.println("They are equal or Palindrome ");
		else System.out.println("They are not equal");
		
		

	}

}
