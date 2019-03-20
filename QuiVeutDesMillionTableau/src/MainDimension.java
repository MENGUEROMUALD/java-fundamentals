
public class MainDimension {
	
	
	
	public static void  main(String[] args) {
		ToyShape shape =new ToyShape();
		Toy toy= new Toy(shape);
		getDimension(toy);
		
	}
	
	
	
	public static <T extends Toy>  T getDimension(T data){
		System.out.println(data.getValue());
		return data;
	}
	
	
}
