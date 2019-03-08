package homework;
import static java.lang.Math.*;

public class mainprojectclass {

	public static void main(String[] args) {
		/*
		 * Vehicle mercedes = new Vehicle();// object class. imports the vehicle file
		 * and assigns mercedes.
		 * 
		 * System.out.println(mercedes.color); mercedes.changecolor("yellow");
		 * mercedes.getcolor();
		 * 
		 * System.out.println("Square root of 64 is : "+sqrt(64));//imports from default
		 * maths class. System.out.println("PI is : "+PI);
		 * 
		 * User man = new User(); // object class (new) man.setName("Andy");
		 * man.setAge(26); man.setHeight(160); man.setGender("Male");
		 * 
		 * System.out.println(man.getName()+" "+man.getAge()+" "+man.getHeight()+" "+man
		 * .getGender()); User boy = man;
		 * 
		 * User girl = new User(); girl.setName("fred");
		 * System.out.println(girl.getName()); girl.setAge(26); girl.setHeight(160);
		 * girl.setGender("Male");
		 * 
		 * System.out.println("Information : "+man.equals(boy));
		 * System.out.println("Information : "+man.equals(girl));
		 * System.out.println("Hashcode = "+man.hashCode());
		 * System.out.println("Hashcode = "+girl.hashCode());
		 * System.out.println("Equals : "+man.toString());
		 * 
		 * System.out.println("Before it is destroyed: "+man.toString());
		 * //Runtime.getRuntime.gc(); //explicitly invokes the garbage collector to
		 * destroy the objects
		 * 
		 * Lesson7 square= new Lesson7();// creating object of lesson7
		 * //square.square(64); // calling the method in lesson7
		 */
		
		SalariedEmployee empl1 = new SalariedEmployee(" Uduma "," Andy ", 1234, 31 , true, 5000);
		System.out.println(empl1);
		System.out.println("");
		
		HourlyEmployee empl2 = new HourlyEmployee(" Uduma ", " Mokonchu ", 1234, 32, true, 12.45, 40);
		System.out.println(empl2);
		System.out.println("");
		
		//BasePlusComissionEmployee empl3 = new BasePlusComissionEmployee(" Uduma "," Andreas ", 1234, 33, true, 50, 2000);
			//System.out.println(empl3);
		
		//ComissionEmployee empl4 = new ComissionEmployee(" Uduma "," Emilia ", 1234, 27, true, 200, 1.5, 900);
		//System.out.println(empl4);
	}
}
