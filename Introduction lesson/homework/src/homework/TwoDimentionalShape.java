package homework;

public class TwoDimentionalShape extends Shape implements Area {
	
	int height;
	
	public TwoDimentionalShape(String name, int width, int height) {
		super(name,width);
		this.height = height;
	}

	@Override
	public float calculateArea() {
		return 0;
	}

}
