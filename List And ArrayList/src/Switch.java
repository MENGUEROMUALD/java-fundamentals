import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Switch {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		System.out.println("entrer un mot");
		Scanner input=new Scanner(System.in);
		String texte=input.nextLine();
		int i=texte.length();
		char premier = texte.charAt(0);
		char dernier = texte.charAt(i-1);
		switch(premier){
		case 'a' :
			switch(dernier){
			case 'a' :
				System.out.println("les deux derniere lettre de votre programme se termine par a");
			break;
			default :
				System.out.println("vos lettre ne commence par les memes lettre");
			}
		break;
		
		}*/
		pascal(1,10);

	}
	public static void pascal(int h, int height) {
		if(h > height)
			return;
		else {
			for (int i = 0; i < height - h; i++) {
				System.out.printf("\t");
			}
			for (int i = 0; i < h;) {
				System.out.printf("\t%d\t", ++i);
			}
				
			System.out.println();
			pascal(++h, height);
		}
	}
}
