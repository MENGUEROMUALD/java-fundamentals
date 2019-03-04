package org.toubou;

import org.toubou.ToyShape;

public class Lesson13Ass {

	public static void main(String[] args) {
		
		/*Cube cube = new Cube("Cube", 8, 2, 3);
		System.out.printf("The volume of %s with sides of %d cm is : %f cm3\n", cube.name,cube.width, cube.calculateVolume());
		
		Square sq = new Square("Square", 6, 6);
		System.out.printf("The volume of %s with sides of %d cm is : %f cm2\n", sq.name,sq.width, sq.calculateArea());
		System.out.printf("Is %s a 2 dimensional shape ? %b\n", cube.name, (sq instanceof TwoDimensionalShape));
		System.out.printf("Is %s even a shape at all ? %b\n", cube.name, (sq instanceof Shape));
		*/
		Shape toy1;
        ToyShape toy =new ToyShape();
		toy1=toy.getmShape();
		System.out.printf("Is %s a 2 dimensional shape ? %b\n", toy1.name, (toy1 instanceof TwoDimensionalShape));
		System.out.printf("The kind choose: is %s  with side of %d cm " , toy1.name,toy1.width);
	}

}
