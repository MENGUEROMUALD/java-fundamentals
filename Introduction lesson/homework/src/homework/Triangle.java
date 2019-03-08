package homework;

public class Triangle extends TwoDimentionalShape implements Area {
	
	public Triangle(String name, int height, int width) {
		super(name, width, height);
		
	}

	@Override
	public float calculateArea() {
		return (width*height)/2;
	}
}
