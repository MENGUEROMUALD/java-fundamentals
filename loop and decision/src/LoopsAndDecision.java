import java.util.Scanner;

public class LoopsAndDecision {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("enter your first number ");
		int firstNumber =input.nextInt();
		System.out.println("enter your second number");
		int secondNumber =input.nextInt();
		if(firstNumber<0||secondNumber<0) {
		do{
			System.out.println("on ne veux pas de nombre negatif reentrer vos deux valeurs");
			System.out.println("enter your first number");
			firstNumber =input.nextInt();
			System.out.println("enter your second number`");
			secondNumber =input.nextInt();
		}
		while(firstNumber<0||secondNumber<0);
		
		}
		for(;firstNumber<=secondNumber;firstNumber++) {
			
			if(firstNumber%2==0) {
				System.out.println(firstNumber);
			}
			
		}*/
		///////exo 2
		System.out.println("enter the number of the multiplication ");
		Scanner input = new Scanner(System.in);
		
		int number =input.nextInt();
		while(number<0) {
			System.out.println("enter the number of the multiplication ");
			int number =input.nextInt(); 
		}
		System.out.println("the multiplication table is");
		for(int table=0;table<=12;table++) {
			System.out.println((number + " x "+table + " = "+number*table));
		}
		
		
		
		
		
		
		
		/*int i =0;
		int b =i%2;
		switch(b) {
		case 0 :System.out.println("votre nombre est possitif");
		default : System.out.println("votre nombre est impair ");
		}*/
		/*switch(i) {
		case 0: System.out.println("le nombre est zero");
		case 1: System.out.println("le nombre est 1");
		default : System.out.println("votre nombre n'est pas enregister");
		}*/
		/*int i= 2;
		if(i%2!=0) {
			System.out.println("votre nombre n'est pas pair");
		}else {
			System.out.println("votre nombre est pair ");
		}*/
		// TODO Auto-generated method stub
		/*for(int a=0,b=1 ;a%b!=1&&a<10;a=b++) {
			System.out.println(a);
		}*/
		/*int a=0;
		while(a<=10) {
			System.out.println(a++);
		}*/
		/*int score = 10;
				while (score <=10) {
					System.out.println("game continue " + score --);
					if(score ==0)break;
					if(score %5==0)continue;
					System.out.println("continuing ");
				}*/
		/*String [] name = {"kenfack","letou","eriko"};
		for (String i : name) {
			System.out.println(i);
		}*/
		/*String [] name = {"kenfack","letou","eriko"};
		for (int i=0; i!=name.length;i++) {
			System.out.println(name[i]);
		}*/
		/*int score =10;
		do {
			System.out.println("game continues ");
			System.out.println(score--);
		}while(score>=0);*/
		
		/*int i =10;
		for (;;) {
			if(i>=0) {
				System.out.println(i--);
			}
		}*/
				
		
	}

}
