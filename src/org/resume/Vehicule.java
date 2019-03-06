package org.resume;

public abstract class Vehicule {
    public abstract void switchGear(int gear);
    public abstract void getTransmission(String transmission);
    public abstract void getName(String name);
    public  int gear;
    public  String transmission;
    public  int Wheels;
    public  String name;
    //public abstract void display(Vehicule v);
	public int getWheels() {
		return Wheels;
	}
}
