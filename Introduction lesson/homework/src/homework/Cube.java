package homework;

public class Cube extends ThreeDimentionalShape implements Volume {
	
	public Cube(String name, int width, int height, int radius) {
		super(name, width, radius, height);
		
	}

	@Override
	public float calculateVolume() {
		return width*height*radius;
	}
}
