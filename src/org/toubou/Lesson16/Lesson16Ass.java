package org.toubou.Lesson16;

public class Lesson16Ass {
         
         
	public static void main(String[] args) {
		double poid=10;
		double a =60;
		double b = 40;
		
		double force=poid*(Math.sin(a)/Math.cos(b));
       //System.out.printf("The force is: %d",force);
       System.out.println("The force is : " +Math.round(force) +" N");
	}

}
