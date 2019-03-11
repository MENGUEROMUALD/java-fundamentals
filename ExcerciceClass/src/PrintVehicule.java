
public class PrintVehicule {
	static Vehicle vehicule =new Toyota(0, null, 0, null);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrintVehicule print = new PrintVehicule();
		 print.display(vehicule);
	}
	public  void display(Vehicle v) {
		System.out.println(vehicule.name);
		System.out.println(vehicule.transition);
		System.out.println(vehicule.wheels);
		
	}

}
