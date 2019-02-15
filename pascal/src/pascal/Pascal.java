package pascal;

public class Pascal {
	public static void main (String args[]) {
	       // Triangle de nombre de Pascal
	      for ( int i = 0; i < 10; i++) {
	         for ( int j =0; j <= i; j++) {
	            System.out.print(" "+j*i);
	         }
	         System.out.println();
	      }
	 
	       // Dessin Triangle
	 
	      for ( int i = 0; i < 13; i++) {
	         for ( int j = 0; j <= 13-i; j++) System.out.print(" ");       
	         System.out.print("< ");
	         for ( int j = 0; j <= i+i; j++) System.out.print("x ");
	         System.out.println("*");
	      }
	   }
}
