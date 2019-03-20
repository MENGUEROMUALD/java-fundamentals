import java.util.Scanner;

public class CalculDelaForce {

	public static void main(String[] args) {
		int alpha = 60;
		int delta = 40;
		int poid =10;
		Scanner input = new Scanner(System.in);
		System.out.println("veillez entrer le poid svp");
		int i = input.nextInt();
		System.out.println("entrer l'angle aplha");
		int y = input.nextInt();
		System.out.println("entrer langle delta");
		int z = input.nextInt();
		System.out.println("poid : "+ i +"kg \n angle  alpha :"+ y +" degree \n delta : "+ z +"degree");
		System.out.println("la formule est F=p(sinAlpha/cosdelta)");
		System.out.println("F= "+i +"(sin+ "+  y  +" *cos40)"+  z);
		System.out.println("le resultat est : ");
		force(i,y,z) ;
	}
	public static void force(int poid,int alpha,int delta) {
		System.out.println("F = "+ (Math.sin(alpha)/Math.cos(delta))*poid +" newton ");
	}
	
	/*System.out.println("calculons la froce d'un coprs aui a pour caracteristiaue : ");
		System.out.println("poid : 10kg \n angle de alpha : 60 \n delta : 40");
		System.out.println("la formule est F=p(sinAlpha*cosdelta)");
		System.out.println("F=P(sin60*cos40)");
		System.out.println("le resultat est :");
		System.out.println("F = "+ (Math.sin(60)/Math.cos(40))*10);*/

}
