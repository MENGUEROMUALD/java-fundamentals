import java.util.Scanner;

public class Factoriel {
	private static Scanner scanner = new Scanner(System.in);
	 
    public static void main(String[] args) {
        char recommencer = 'o';
        do {
            int n = demanderNombre();
            System.out.println("Méthode itérative :");
            System.out.println(n + "! = " + factorielleIterative(n));
            System.out.println("Méthode recursive :");
            System.out.println(n + "! = " + factorielleRecursive(n));
            System.out.println("Voulez-vous recommencer [o/n] ?");
            recommencer = scanner.next().charAt(0);
        } while (recommencer == 'o');
    }
 
    
    static int demanderNombre() {
        int n;
        do {
            System.out.println("Donnez un nombre entier compris entre 0 et 12 (compris)");
            n = scanner.nextInt();
        } while ((n > 12) || (n < 0));
        return n;
    }
 
   
    static int factorielleIterative(int nombre) {
        int fact = 1;
        for (int i = 2; i <= nombre; i++) {
            fact *= i;
        }
        return fact;
    }
 
    
     static int factorielleRecursive(int nombre) {
        if (nombre == 0) {
            return 1;
        } else {
            return (nombre * factorielleRecursive(nombre - 1));
        }
    }

}
