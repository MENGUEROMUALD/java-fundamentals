import java.util.Scanner;

public class Lesson5AddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("veiller entrer un nombre possitif");
		int nombre = input.nextInt();
		if(nombre<0) {
			while(nombre>0) {
				System.out.println("veiller entrer un nombre possitif");
				nombre = input.nextInt();
			}
		}
		for(int i=0;i<=nombre;i++) {
			System.out.println(i=i+i);
		}

	}

}
