import java.util.Scanner;

public class Premier {
	 static boolean estPremier=false;
	  
	 private static boolean isPrime;
	    private static Scanner input;

	    public static void main(String[] args){
	        input = new Scanner(System.in);
	        System.out.println("Enter a prime number ( you think ) : ");
	        int num = input.nextInt();
	        isPrime = true;
	        for(int divisor = 2; divisor <= num / 2; divisor++) {
	            if (num % divisor == 0) {
	                isPrime = false;
	                break; 
	            }
	        }
	        if(isPrime){
	            System.out.println("Prime");
	        }
	        else{
	            System.out.println("Not a prime");
	        }
	    }
	 
	 /*public static void pasPremier(int n){ 
			boolean pasPremier =(n%2==0);
		  for(int i=3;i<n; i=i+2){
			  if( pasPremier) 
			  break;
		   pasPremier=(n%i==0);
		  }
		  if(pasPremier)
			  System.out.println(n+" n'est pas premier");
		  else 
			  System.out.println(n+" est premier");
		  }*/
      

}
