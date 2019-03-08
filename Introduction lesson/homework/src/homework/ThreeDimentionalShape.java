package homework;

public class ThreeDimentionalShape extends Shape {
	
	int radius, diameter = radius * 2, height;

	public ThreeDimentionalShape(String name, int width, int height,int radius) {
		super(name, width);
		this.radius = radius;
		this.height = height;
	}

}
