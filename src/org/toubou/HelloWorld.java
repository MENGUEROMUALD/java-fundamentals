/**
 * @author jeansylvain.toubou
 *
 */
package org.toubou;

import java.util.Scanner;
import org.toubou.Vehicule;
import static java.lang.Math.*;

import java.io.UnsupportedEncodingException;

public class HelloWorld {
	//print "Hello World" to the console. line 2
	/* Multi line comment. line 3 */
	/** 
	 ************* Primitives datatypes_********************
	 * static byte x; 1byte is 1byte 
	 * static short x;  1 short is 2 bytes
	 * static int_ x;  1 intiger_ is 4 bytes
	 * static long x;  1 long is 8 bytes
	 * static float x;  1 long is 4 bytes
	 * static double x;  1 long is 8 bytes
	 * static boolean x; boolean is two values true or false
	 * static char x; char is a single 16-bit uni_code
	 * 
	 * ***********Non-Primitives(composites) datatypes_*******
	 * String,Array,class
	 */

	
	/*
	 * public static int MAX_AGE=100; //class variable private int
	 * _age=25;//instance variable pro
	 tected char type='E';
	*/
	public static  void main(String[] args) { 
		/*int a=10;//local Variable
		int b=5;
		
		String name ="larry";
		String hello="Hi,"+name;
		
		int z=4*3-1+5-(3*2);
		/*
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a x:");
		int x = input.nextInt(); // reads a string from the user as input 
		System.out.println("You entered x: " +x);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a y:");
		int y = input1.nextInt(); // reads a string from the user as input 
		System.out.println("You entered x: " +y);
		System.out.println("COND result is "+(x<y?x:y));
       *//*
		System.out.println(z);
		*/
		/*
		int a =10;
		for (;;){
			if (a>=0)
			System.out.println(a--);
			}
			*/
		/*
		int a =0;
		while(a<=10){
			System.out.println(a++);
			}
		*/
		/*
		int a =10;
		do{
			System.out.println(a--);
			}while (a>=0);
			*/
		/*
		int score = 10;
		while(score <= 10){
			System.out.println("Game continues "+score--);
			if(score == 0) return;
			if(score % 5 == 0) continue;
			System.out.println("Continuing");
		}
		
		String[] names = {"Tom", "Jerry", "Lucy"};
		for (String name : names){
			if (name!="Jerry")  {
		       System.out.println("Name:"+name);
			}
		}
		
		
		String[] names = {"Tom", "Jerry", "Lucy"};
		for (int i=0;i<names.length;i++){
		       System.out.println("Name:"+names[i]);
			
		}*/
		/*
	 for (int a=20;a>=0;a--) {
	 if (a%2==0) 
		 System.out.println(a +" est un nombre pair");
	 else
		 System.out.println(a +" est un nombre impair");
	 }
	 
		for (int a=20;a>=0;a--) {
		   int value=a%2;
			switch(value) {
			case 0: System.out.println(a +" est pair");
			        break;
	        default: System.out.println(a +" est impair");
					break;
	 
			}
		}
		
		Vehicule myVehicule;
		myVehicule = new Vehicule(5,20,"Blue");
		System.out.println("Vehicule doors: " + myVehicule.doors);
		System.out.println("Vehicule speed: " + myVehicule.speed);
		System.out.println("Vehicule color: " + myVehicule.color);
        System.out.println("square root of 64 is: "+sqrt(64));
        System.out.println("PI is "+PI);
	
		
		
		
		Vehicule.printArray(3,5,10,9,6,7);
		Vehicule.square(6);
		
		String name = new String("larry");
		int c = name.compareTo("arry");
		System.out.println(c); 
		//output is 0
		
		StringBuffer buf = new StringBuffer("Seven Academy");
		String name = "SevenAcademy";
		boolean result = name.contentEquals(buf);
		System.out.println(result); 
		
		char[] java = {'j','a','v','a'};
		String javaCopy = String.copyValueOf(java,1,2);
		System.out.println(javaCopy);
		
		String s = "seven";
		byte[] result;
		try {
			result = s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		String s = "udemy course udemy udemy course";
		//System.out.println(s.matches("(.?)udemy(.+)")); 
		System.out.println(s.replaceFirst("(.*)udemy", "Seven"));
		//output is: true
        */
		String s = "the only way to learn-code is to code at-seven  ";
		//for(String split : s.split("-",3))
			//System.out.println(split.startsWith("code",11));
		System.out.println(s.trim());
		
		/*
		//demonstrating the Object class’ method equals
		class Cat{
		       String color, name;
		       public Cat(String name, String color){
		                this.name = name;
		                this.color = color;
		       }
		}
		        Cat mycat = new Cat("Kitty", "black");
		        Cat nCat = mycat;
		        Cat mCat = new Cat("Kitty", "black");
		        System.out.println("Equals: "+mycat.equals(nCat));
		        System.out.println("Equals: "+mycat.equals(mCat));     
		        System.out.println("Equals: "+mycat.toString());
		        */
		/** Triangle isocele
		*for (int row = 1; row < 20; row += 2)
	    *  {
	    *     for (int col = 0; col < 19 - row / 2; col++)
	    *        System.out.print(" ");
	    *     for (int col = 0; col < row; col++)
	    *       System.out.print("*");
	    *    System.out.print('\n');
	    *  }
	     */
		
}
/*	
public void privateage() {
	System.out.println("Age: " +_age);
}

public void protectedage() {
	System.out.println("Age: " +type);
}*/

	
}