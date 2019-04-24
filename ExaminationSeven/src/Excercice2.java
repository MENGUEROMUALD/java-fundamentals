import java.util.Scanner;

public class Excercice2 {

	public static void main(String[] args) {
		System.out.println("Donnez moi votre nombre svp !!!!");
		Scanner input=new Scanner(System.in);
		String num=input.nextLine();
		InLetter(num);
	}
	public static void InLetter(String num) {
		String[] unite= {"Zero","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
		String[] dizaine= {"dix","one","douze","Treize","Quatorze","Treize","seize","dix-huit","dix-neuf","vingt"};
		String[] centaine= {"cent","deux-cent","trois-cent","quatre-cent","cinq-cent","six-cent","sept-cent","huit-cent","neuf-cent","mille"};
		for(int i=0;i<num.length();i++) {
			if(num.length()==3&&num.charAt(1)==1) {
					System.out.println(centaine[i]);
			}
		}
		
	}
	
	

}
