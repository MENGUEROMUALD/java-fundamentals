package homework;

public class Square extends TwoDimentionalShape implements Area {
	

	public Square(String name, int height, int width) {
		super(name, width, height);

	}

	@Override
	public float calculateArea(){
		return height*width;
	}

}
