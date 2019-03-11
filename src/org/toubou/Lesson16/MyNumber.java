package org.toubou.Lesson16;

public class MyNumber {


		static Double myDouble = Double.parseDouble("5.5");
		static Integer myInt = Integer.parseInt("16", 8); 
		static Short mShort = Short.parseShort("101", 2);
		static Long mlong = Long.parseLong("5000000"); 


		public static void main(String[] args){
				System.out.printf("%f", myDouble ); 
				System.out.println();
				System.out.printf("%d", myInt );
				System.out.println();
				System.out.printf("%d", mShort );
				System.out.println();
				System.out.println(mlong); 
		}
}
