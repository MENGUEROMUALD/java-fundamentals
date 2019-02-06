package homework;
import static java.lang.Math.*;

public class mainprojectclass {

	public static void main(String[] args) {
		Vehicle mercedes = new Vehicle();//imports the vehicle file and assigns mercedes.
		
		System.out.println(mercedes.color);
		mercedes.changecolor("yellow");
		mercedes.getcolor();
		
		System.out.println("Square root of 64 is : "+sqrt(64));//imports from default maths class.
		System.out.println("PI is : "+PI);
		
		User man = new User();
		man.setName("Andy");
		man.setAge(26);
		man.setHeight(160);
		man.setGender("Male");
		
		System.out.println(man.getName()+" "+man.getAge()+" "+man.getHeight()+" "+man.getGender());
	}
}
