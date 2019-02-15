package ExcerciceOne;

import java.util.Scanner;

public class Pascal {
	public static void main (String args[]) {
	       // Triangle de nombre de Pascal
		System.out.println(" enter the value of the pascal Triangle");
		Scanner input= new Scanner(System.in);
		int choice = input.nextInt();
	      for ( int i = 0; i < choice; i++) {
	         for ( int j =0; j <= i; j++) {
	            System.out.print(" "+j*i);
	         }
	         System.out.println();
	      }
	      }
	   }

