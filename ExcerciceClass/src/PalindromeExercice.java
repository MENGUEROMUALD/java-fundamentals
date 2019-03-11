import java.util.Scanner;

public class PalindromeExercice {

	public static void main(String args[]){
       String mot, mot_inverse = "";
       Scanner in = new Scanner(System.in);
  
       System.out.println("Entrer un mot ");
       mot = in.nextLine();
  
       if (pal(mot))
          System.out.println("'"+mot + "' est un palindrome");
       else
          System.out.println("'"+mot + "' n'est pas un palindrome");
       
    }
    
    public static boolean pal(String mot){
    int i=0, 
    longueur=mot.length()-1;
    boolean egale=true;
        while(i<longueur/2 && egale){
           if(mot.charAt(i)==mot.charAt(longueur-i))
              egale = true;
           else
              egale = false;
           i++;
        }
        return egale;
    }

}
