
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(5,6);
	}
	private static void swap(int a, int b) {
	    System.out.println("Before Swaping: a = " + a + " and b= " + b);
	    // swapping value of two numbers without using temp variable and XOR bitwise operator
	    System.out.println("******Before Swap*********");
	    System.out.println("a= "+a);
	    System.out.println("b= "+b);
	    a = a + b;
	    b = a - b;
	    a = a - b;
	    System.out.println("After  Swaping: a = " + a + " and b= " + b);

	}

}
