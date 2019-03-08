package homework;

public class Main13 {

	public static void main(String[] args) {
		
		String Triangle = null;
		Triangle tri = new Triangle(Triangle, 5, 10);
		System.out.println("Triangle Area = "+tri.calculateArea());
		System.out.println("");
		
		String Square = null;
		Square sq = new Square(Square, 10, 5);
		System.out.println("Square Area = "+sq.calculateArea());
		System.out.println("");
		
		String Cube = null;
		Cube cu = new Cube(Cube, 10, 5, 5);
		System.out.println("Cube volume = "+cu.calculateVolume());
		System.out.println("");
		
		String Cylinder = null;
		Cylinder cy = new Cylinder(Cylinder, 10, 5, 5);
		System.out.println("Cylinder volume = "+cy.calculateVolume());
		
		
		

	}

}
