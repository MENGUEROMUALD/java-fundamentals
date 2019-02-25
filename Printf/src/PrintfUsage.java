import java.util.Calendar;
import java.util.Scanner;

public class PrintfUsage {

	public static void main(String[] args) {
			Calendar calendar = Calendar.getInstance();
			/*System.out.println("triangle de pascal");
			System.out.println("entrer un nombre ");
			Scanner input = new Scanner(System.in);
			int nombre =input.nextInt();
			
			for ( int i = 1; i < nombre; i++) {
		         for ( int j =1; j <= i; j++) {
		        	
		            System.out.print(" "+j*i);
		         }
		         System.out.println();
		      }*/
			System.out.println(calendar);
			//System.out.printf("%1$tA,%1$tB %1$td,%1$tY,%1$tr\n",calendar);
			// Dessin Triangle
			 
		      /*for ( int i = 0; i < 13; i++) {
		         for ( int j = 0; j <= 13-i; j++) System.out.print(" ");       
		         System.out.print("< ");
		         for ( int j = 0; j <= i+i; j++) System.out.print("x ");
		         System.out.println("*");
		      }
		   }*/
			/*for(int i=0;i<10;i++) {
				for(int j=0;j<i;j++) {
					System.out.printf("%d %d %d",j,i=2,j);
				}
				System.out.printf("%d",i);
			}*/ 
			
	}
}


