package homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import homework.Card;
public class Card12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("TYPE IN PLAYER1 NAME : ");
		String player = input.nextLine();
		CardUser12 player1 = new CardUser12(player);
		
		System.out.println("TYPE IN PLAYER2 NAME : ");
		player = input.nextLine();
		CardUser12 player2 = new CardUser12(player);
		System.out.println("");
		
		System.out.println(player1.getUsername()+" AND "+player2.getUsername()+" WELCOME TO THE CARD GAME.");
		System.out.println("");
		
		
		  String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		  String[] type = {" club"," spade"," diamond"," heart"};
		 
		Card[] cardDeck = new Card[54];
		cardDeck[0]= new Card("JOKER","(r)");
		cardDeck[1]= new Card("JOKER","(b)");
		
		for(int i = 2; i < cardDeck.length;) {
			for(int j = 0; j < symbol.length; j++) 
				for(int k = 0; k < type.length; k++)
					cardDeck[i++] = new Card(symbol[j],type[k]);
		}
		/*
		 * for(int l=0; l<cardDeck.length;l++) { String cards =
		 * cardDeck[l].getSymbol()+" "+cardDeck[l].getType(); System.out.println(cards);
		 * 
		 * 
		 * }
		 */
		List<Card> shufflePack = Shuffle(cardDeck);
		
		/*
		 * for(int l=0; l<shufflePack.size();l++) { String cards =
		 * shufflePack.get(l).getSymbol()+" "+shufflePack.get(l).getType();
		 * System.out.println(cards);
		 * 
		 * }
		 */
		List<Card> user1Cards = selectCards(shufflePack);
		System.out.println(player1.getUsername());
		for(int l=0; l<user1Cards.size();l++) { 
			String c = user1Cards.get(l).getSymbol()+" "+user1Cards.get(l).getType();
			  System.out.println(c);
		}
		System.out.println("");
		List<Card> user2Cards = selectCards(shufflePack);
		System.out.println(player2.getUsername());
		for(int l=0; l<user2Cards.size();l++) { 
			String c = user2Cards.get(l).getSymbol()+" "+user2Cards.get(l).getType();
			  System.out.println(c);
		}
		System.out.println("");
		 System.out.println(player1.getUsername() +" has " +getCardsPoints(user1Cards)+" points");
		 System.out.println(player2.getUsername() +" has " +getCardsPoints(user2Cards)+" points");
	
}
	static List<Card> selectCards(List<Card>  cards){
		Random r = new Random();
		List<Card> selected = new ArrayList<Card>();
		for(int i=0; i<5; i++) {
			int rand = r.nextInt(cards.size() - 1);
			selected.add(cards.get(rand));
			cards.remove(rand);
			
		}
		return selected;
	}
	
	static int getCardsPoints(List<Card>  cards){
	
		int totalPoints = 0;
		for(int i=0; i<cards.size(); i++) {
			totalPoints += cards.get(i).getPoint();
			
		}
		return totalPoints;
	}
	
	
		public static List<Card> Shuffle(Card[] v){
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			int rand = r.nextInt(53);
			int rand2 = r.nextInt(53);
			Card cr = v[rand];
			v[rand] = v[rand2];
			v[rand2] = cr;
		}
		return new ArrayList<Card>(Arrays.asList(v));
		}
		
		Card[] myCards = new Card[5];
		
		public void setCards(Card...c) {
			for (int i = 0; i < 5; i++) {
				myCards[i] = c[i];
			}
			System.out.println(myCards);
		}
		
		
				
}		
	

