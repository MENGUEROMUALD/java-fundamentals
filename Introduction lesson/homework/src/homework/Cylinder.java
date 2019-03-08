package homework;

public class Cylinder extends ThreeDimentionalShape implements Volume{
	

	public Cylinder(String name, int width, int radius, int height) {
		super(name, width, radius, height);
		
	}

	@Override
	public float calculateVolume() {
		return (float) (Math.PI*(radius*radius)*height);
	}

}
