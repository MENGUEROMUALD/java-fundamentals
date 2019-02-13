import java.util.Scanner;

public class Facto {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("veiller entrer un nombre");
		int nombre = input.nextInt();
		int fact = 1;
		for(int i = nombre; i >= 1; i--){
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
