import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpyNomber {
	Scanner input = new Scanner(System.in);
	List allNumber;
	int addition=0;
	int multiplication=0;
	
	public void takenumber(int number) {
		allNumber=new ArrayList();
		while(number>0) {
			int mod = number%10;
			allNumber.add(mod);
			addition = addition+mod;
			 multiplication =multiplication*mod;
			System.out.println(mod);
			number-=mod;
			number/=10;
		}
		System.out.println("---------");
		System.out.println(addition);
		System.out.println(multiplication);
		if(addition!=multiplication) {
			System.out.println("votre nombre n'est pas un nombre espion");
		}else {
			System.out.println("votre nombre est un nombre espion!!");
		}
	}

}
