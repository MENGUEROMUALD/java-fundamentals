
public class PhoneNumber {
	static Double myDouble = Double.valueOf(3) ; //can also pass a double or float
	static Integer myInt = Integer.valueOf("16", 8); //will convert the number in base 8 to a base 10 integer
	static Short mShort = Short.valueOf("10"); //extracts the value 10 as value to the object
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello, Welcome to Seven");
		char[] array = new char[5];
		sb.getChars(0, 5, array, 0);
		System.out.printf("Characters %s", new String(array) );
		System.out.println(" ");
		sb.append(". Thanks!");
		System.out.printf("Characters %s", sb.toString() );
		System.out.println(" ");
		sb.append(1);
		System.out.println(sb.toString());
		System.out.println(" ");
		sb.append('F');
		System.out.println(sb.toString());
		System.out.println("--------------- ");
		String s1 = "Hello";
		StringBuilder sw = new StringBuilder(s1);
		sw.insert(5, " Akah"); 
		System.out.println(sw.toString());
		System.out.println("--------------- ");
		sw.delete(0, 4);
		System.out.println(sw.toString());
		System.out.println("--------------- ");
		String text = "Hello, Welcome to Seven"; 
		String roar = text.substring(0, 5); 
		System.out.println(roar );
		System.out.println("--------------- ");
		StringBuilder sc = new StringBuilder("Hello, Welcome to Seven");
		for(int i=1;i<=1;i++) {
			System.out.println(sc.charAt(2)+" "+sc.charAt(4)+" " + sc.charAt(6));
		}
		System.out.println("--------------- ");
		Integer myInteger = 10; 
		int mInt = myInteger ; 
		System.out.printf("%d\n",myInteger); 
		System.out.printf("%d", mInt);
		System.out.println("--------------- ");
		System.out.printf("%d\n", myInteger.byteValue() );
		System.out.printf("%f\n", myInteger.floatValue() );
		System.out.println("--------------- ");
		System.out.printf("%f\n", myDouble ); 
		System.out.printf("%d\n", mShort ); 
		System.out.printf("%d", myInt);
		

	
		
	}


}
