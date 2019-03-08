package homework;

public abstract class Vehicle16 {
	
	public abstract void switchGear(int gear); 		
	
	public abstract void getTransmission(String transmission);
	
	private String transmission;
	private int wheels;
	private String name;
	private int gear;
	
	public void display(String v) {
		System.out.println("Transmission is "+transmission);
		System.out.println("Vehicle name is "+name);
	}
	public Vehicle16() {
		this.transmission = transmission;
		this.name = name;
	}

}
