package homework;

import java.util.Random;
import java.util.Scanner;
import javax.print.attribute.IntegerSyntax;

public class Lesson7 {

	public static void main(String[] args) {
		
		System.out.println(Lesson7base.add(5, 12)); //move mothod in cats(main in problems) and dice????
	
		Fruit vit = new Fruit();
		vit.setColor("Yellow");
		vit.setTexture((float) 0.5);
		
		System.out.println(vit.getColor()+" "+vit.getTexture());
		
		Fruit.sayHello();
		Fruit.hi(5,3);
		Fruit.cuz(5,4);
		Fruit.square(25);
		
		
		/*
		 * Fruit vita = vit; Scanner input = new Scanner(System.in);
		 * System.out.println("Enter steps : "); int steps = input.nextInt();
		 * move(steps, true);
		 */
		
		
		
		  Fruit exa = vit;
		  exa.squa(6); 
		  
		 
	}
	Scanner input = new Scanner(System.in);

	/*
	 * public void rollDice(int a){ Random random = new Random(); for(int i=0; i <
	 * a; i++) {System.out.println(random.nextInt(a)+1); }}
	 */
	/*public void rollDice(){ //this method rolls a dice 6 times
		Random random = new Random();
		for(int k=0; k < 6; k++){
			System.out.println(random.nextInt(6) + 1);
			}*/
		
		//rollDice(6); rollDice()
	
}
