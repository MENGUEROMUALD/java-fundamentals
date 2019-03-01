import java.util.Scanner;

public class PrincipalInterace {

	public static void main(String[] args) {
		System.out.println("Aue voulez vous calculer ?");
		System.out.println("1-Deux dimension ou 2-trois dimension ?");
		Scanner input = new Scanner(System.in);
		int i=input.nextInt();
		if(i==1) {
			System.out.println("deux dimension");
			System.out.println("1-carre ou 2-triangle ?");
			int b=input.nextInt();
			if(b==1) {
				System.out.println("carre");
				System.out.println("entrer le cote du carre pour le calcul d'aire");
				int c=input.nextInt();
				Shape carre=new Square(c);
				System.out.println("le resultat de l'aire du carre est " + carre.cacluAire());
			}else {
				System.out.println("triangle");
				System.out.println("entrer le la base et la hauteur du triangle pour le calcul d'aire");
				int b2=input.nextInt();
				int h2=input.nextInt();
				Shape triangle=new Triangle(h2,b2);
				System.out.println("le resultat de l'aire du triangle est " + triangle.cacluAire());
			}
		}else {
			System.out.println("three dimension");
			System.out.println("1-cercle ou 2-cube ?");
			int b=input.nextInt();
			if(b==1) {
				System.out.println("cercle");
				System.out.println("entrer le rayon du cercle pour le calcul d'aire");
				int e=input.nextInt();
				Shape cercle=new Cercle(e);
				System.out.println("le resultat de l'aire du cercle est " + cercle.cacluAire());
			}else {
				System.out.println("cube");
				System.out.println("entrer le la longueur de l'arrete du cube pour le calcul d'aire");
				int d=input.nextInt();
				Shape cube=new Cube(d);
				System.out.println("le resultat est " + cube.cacluAire());
			}
		}

	}

}
