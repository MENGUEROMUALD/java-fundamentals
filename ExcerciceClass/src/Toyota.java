
public class Toyota extends Vehicle{
	
	
	public Toyota(int gear, String transition, int wheels, String name) {
		super(4, "automatical", 4, "Toyota Rav 4");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int switchGear() {
		
		return 4;
	}

	@Override
	public String getTransition() {
		// TODO Auto-generated method stub
		return "automatique";
	}

	

}
