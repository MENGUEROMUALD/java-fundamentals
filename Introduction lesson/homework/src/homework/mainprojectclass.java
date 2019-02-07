package homework;
import static java.lang.Math.*;

public class mainprojectclass {

	public static void main(String[] args) {
		Vehicle mercedes = new Vehicle();// object class. imports the vehicle file and assigns mercedes.
		
		System.out.println(mercedes.color);
		mercedes.changecolor("yellow");
		mercedes.getcolor();
		
		System.out.println("Square root of 64 is : "+sqrt(64));//imports from default maths class.
		System.out.println("PI is : "+PI);
		
		User man = new User(); // object class (new)
		man.setName("Andy");
		man.setAge(26);
		man.setHeight(160);
		man.setGender("Male");
		
		System.out.println(man.getName()+" "+man.getAge()+" "+man.getHeight()+" "+man.getGender());
		User boy = man;
		
		User girl = new User();
		girl.setName("Andy");
		girl.setAge(26);
		girl.setHeight(160);
		girl.setGender("Male");
		
		System.out.println("Information : "+man.equals(boy));
		System.out.println("Information : "+man.equals(girl));
		System.out.println("Hashcode = "+man.hashCode());
		System.out.println("Hashcode = "+girl.hashCode());
		
	}
}
