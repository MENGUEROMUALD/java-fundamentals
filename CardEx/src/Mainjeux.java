import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Mainjeux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] symbole = {"joker","dame","valet","1","2","3","4","5","6","7","8","9","10","roi"};
		String [] faces = {"coeur","carreau","pique","trefle"};
		CardEx[] cartes = new CardEx[54];
		cartes[0]=new CardEx("joker","noir");
		cartes[1]=new CardEx("joker","rouge");
		for(int w=2;w<cartes.length;) {
			for(int i=0;i<faces.length;i++) 
				for(int j=1;j<symbole.length;j++) 
					cartes[w++]=new CardEx (faces[i],symbole[j]);
		}
		/*for(CardEx i1: cartes) {
			melange(cartes);
			System.out.println(i1.toString());
		}*/
		melange(cartes);
		List<CardEx> listofcard = new ArrayList();
		for(CardEx mycard: cartes) {
			listofcard.add(mycard);
		}
			Joueurs playerOne = new Joueurs();
			Joueurs playerTwo = new Joueurs();
			playerOne.setCard(listofcard.remove(0),listofcard.remove(0),listofcard.remove(0),listofcard.remove(0),listofcard.remove(0));
			playerTwo.setCard(listofcard.remove(0),listofcard.remove(0),listofcard.remove(0),listofcard.remove(0),listofcard.remove(0));
		System.out.println("\nUser one cards");
		for(CardEx c : playerOne.getCard()) {
			System.out.println(c);
		}
		System.out.println("\nuser Two have");
		for(CardEx c : playerTwo.getCard()) {
			System.out.println(c);
			
		}
		
		
	}
	
	public static List<CardEx> melange(CardEx cartes[]) {
		Random ran= new Random();
		int index =ran.nextInt(cartes.length-1);
		int index2 =ran.nextInt(cartes.length-1);
		List listeMelange= new ArrayList();
		CardEx cr =cartes[index];
		cartes[index]=cartes[index2];
		cartes[index2]=cr;
		return Arrays.asList(cartes);
		
	}
	

}
