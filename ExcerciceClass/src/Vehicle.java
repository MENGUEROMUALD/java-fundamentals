
public abstract class Vehicle {
	int gear;
	public Vehicle(int gear, String transition, int wheels, String name) {
		super();
		this.gear = gear;
		this.transition = transition;
		this.wheels = wheels;
		this.name = name;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTransition(String transition) {
		this.transition = transition;
	}
	String transition;
	int wheels;
	String name;
	public abstract int switchGear();
	public abstract String getTransition();
}
