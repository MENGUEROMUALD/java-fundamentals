import java.util.Scanner;

public class Square implements Shape{
	private int cote;
	public Square(int cote) {
		super();
		this.cote = cote;
	}
	@Override
	public double cacluAire() {
		return cote*cote;
	}

}
