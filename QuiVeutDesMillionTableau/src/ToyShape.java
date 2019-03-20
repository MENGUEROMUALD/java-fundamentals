import java.util.Scanner;

public class ToyShape {
	public Shape mShape;

	public Shape getmShape() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Choose the kind of Shape you want to return:\n"
								+"1 for Triangle\n"
								+"2 for Square\n"
								+"3 for Cube\n"
								+"Default for Cylinder"
								);
		int x = input.nextInt(); // reads a string from the user as input 
		System.out.println("Your Choose is: " +x);
		
		switch(x) {
		case 1: 
			Triangle t = new Triangle("Triangle", 5, 3);
			mShape= t;
			break;
		case 2:
			Square s = new Square("Square", 5, 5);
			mShape= s;
			break;
		case 3:
			Cube c = new Cube("Cube",8, 5, 3);
			mShape= c;
			break;
		default:
			Cylinder cy = new Cylinder("Cylinder",8, 5, 3);
			mShape= cy;
			break;
		}
		
		return mShape;
	}

	public void setmShape(Shape mShape) {
		this.mShape = mShape;
	}
    
	public float getSize(Shape mShape) {
	     
		if(mShape instanceof Square)
			return ((Square) mShape).calculateArea();
		if(mShape instanceof Triangle)
			return ((Triangle) mShape).calculateArea();
		if(mShape instanceof Cube)
			return ((Cube) mShape).calculateVolume();
			
		if(mShape instanceof Cylinder)
			return ((Cylinder) mShape).calculateVolume();
		return 0;
					
	}
}
