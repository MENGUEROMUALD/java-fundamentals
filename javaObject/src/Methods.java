import static java.lang.Math.*;
public class Methods {

	public static void main(String[] args) {
		//getnumber(1,5,8,65,10,52);
			getsquare(10);
		
	}
	
	
	public static void getnumber(int...x) {
		System.out.println(x[0]+" "+ x[1]);
		
	}
	public static void getsquare(int numberToSquare) {
		System.out.println("the square of " + numberToSquare +" is " + sqrt(numberToSquare));	}
	

}
