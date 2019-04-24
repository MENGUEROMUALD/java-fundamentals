import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a - first determine  if the number is a prime number");
		System.out.println("---------------------------------------------");
		System.out.println("Donnez moi votre nombre svp !!!!");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		checkIsPrime(num);
		System.out.println("b - second determine  if the number is a perfect number");
		System.out.println("---------------------------------------------");
		perfectNumber(num);
	}
	/**
	 * ici il est question de determiner si le nombre est un nombre premier
	 * @param Number
	 */
	public static void checkIsPrime(int num) {
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i){
            
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " est un nombre premier");
        else
            System.out.println(num + " n'est pas un nombre premier");
	}
	/**
	 * ici il est question de determiner si le nombre est un nombre parfait
	 * @param Number
	 */
	public static void perfectNumber(int Number) {
		int i, Sum = 0 ;
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.printf("\n%d bravo c'est un nombre parfait", Number);
		}
		else {
			System.out.printf("\n%d desole mais ce n'est pas un nombre parfait", Number);
		}
	}

		 

}
