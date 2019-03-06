package org.resume;

public class Toyota{

	public  void display(Vehicule v) {
      v.getName("TOYOTA");
      v.getTransmission("AUTOMATIQUE");
      v.switchGear(3);
	}
    
	public static void main(String[] Args) {
		Toyota t =new Toyota();
		t.display(new Vehicule() {
			@Override
			public  void switchGear(int gear) {
				if (gear<4)
				    gear=gear +1;
				else
					gear=gear-1;
				
				System.out.println(gear);
			}
		    
			@Override
			public  void getTransmission(String transmission) {
				System.out.println(transmission);
			}
			@Override
			public void getName(String name) {
				System.out.println(name);
			}
		});
	}

	
}
