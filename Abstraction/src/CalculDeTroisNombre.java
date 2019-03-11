import java.util.Scanner;

public class CalculDeTroisNombre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("veillez entrer trois nombre");
		int numberOne = input.nextInt();
		int numberTwo =input.nextInt();
		int numberThree=input.nextInt();
		calcul(numberOne,numberTwo,numberThree);

	}
	
	public static int max(int a,int b) {
		return( a>b?a:b);
	}
	public static void calcul(int a,int b,int c) {
		System.out.println(a>b?max(a,c):max(b,c));
		
	}
	
	
}


