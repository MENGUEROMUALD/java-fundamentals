
public class Triangle implements Shape{
		int i;
		int h;
	@Override
	public double cacluAire() {
		return i*h*0.5;
	}
	public Triangle(int i, int h) {
		super();
		this.i = i;
		this.h = h;
	}

}
