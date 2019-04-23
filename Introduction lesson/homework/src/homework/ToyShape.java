package homework;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class ToyShape {
	static Scanner input = new Scanner(System.in);
	String Shape;
	
	public static void main(String[] args) {
		
		//ToyShape.getShape();
		ToyShape.getSize();
	}
	public static void getShape() {
		
		System.out.println("Type in a number(1 to 4) to get the shape : ");
		int a = 3;
		do {
		int s = input.nextInt();
		switch (s){
		
		case 1:
			System.out.println(" Triangle "); break;
		case 2:
			System.out.println(" Square "); break;
		case 3:
			System.out.println(" Cube "); break;
		case 4:
			System.out.println(" Cylinder "); break;
		default:
			System.out.println(" Out of range "); break;
		
		}
		int b = (a--);
		}while (a != 0);
	}
	public static void getSize() {
		System.out.println("Type in a shape and get the metric value : ");
		int x = 4;
		do {
		String Shape = input.nextLine();
		
		String b = "Square";
		String c = "Cube";
		String d = "Cylinder";
		if(Shape.equalsIgnoreCase("Triangle"))
			System.out.println("Metric value = Area ");
		if(Shape.equalsIgnoreCase(b))
			System.out.println("Metric value = Area ");
		if(Shape.equalsIgnoreCase(c))
			System.out.println("Metric value = Volume ");
		if(Shape.equalsIgnoreCase(d))
			System.out.println("Metric value = Volume ");
		int f = (x--);
	}while (x != 0);
	
	}
}
