package homework;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class ToyShape {
	static Scanner input = new Scanner(System.in);
	String Shape;
	
	public static void main(String[] args) {
		
		ToyShape.getShape();
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
		String Shape = input.nextLine();
		switch (Shape.compareToIgnoreCase(null)) {
		
		int Triangle;
		case Triangle:
			System.out.println("Metric Value = Area ");
		case Square:
			System.out.println("Metric value = Area ");
		case Cube:
			System.out.println("Metric Value = Volume ");
		case Cylinder:
			System.out.println("Metric Value = Volume ");
			default:
				System.out.println("Out of range");	
		}
		
	}

}
