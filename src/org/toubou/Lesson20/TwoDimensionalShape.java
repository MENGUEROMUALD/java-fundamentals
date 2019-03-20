package org.toubou.Lesson20;
import org.toubou.*;
public class  TwoDimensionalShape extends Shape implements Area{

	

	public TwoDimensionalShape(String name, int width) {
		super(name, width);
	}

	public static <T extends Toy<T> > void getDimension(T data){
		System.out.printf("The generic type Toy  %s ", data.getData());
		
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
