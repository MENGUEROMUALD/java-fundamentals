package org.toubou.Lesson16;

public class Examples {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("Hello, Welcome to seven");
        System.out.println("Oldcapacity :" +sb.capacity());
        System.out.println("Oldlength :" +sb.length());
        /*sb.ensureCapacity(25);
        System.out.println("Newcapacity :" +sb.capacity());
        System.out.println("Character :" +sb.charAt(10));
        sb.setCharAt(0,'W');
        System.out.println("String after setcharat :" +sb.toString());
        sb.reverse();
        System.out.println("String after reverse :" +sb.toString());
        */
        
        char[] newsb =new char[5];
        /*sb.getChars(0, 5, newsb, 0);
        for(int i=0;i<5;i++)
           System.out.println("after getchars :" +newsb[i]);*/
        sb.insert(14, " John");
        System.out.println("String after insert :" +sb.toString());
        sb.delete(14, 19);
        System.out.println("String after delete :" +sb.toString());
        
        for(int i=0;i<5;i++)
        	newsb[i]=sb.charAt(i);
        for(int i=0;i<5;i++)
            System.out.println("First five Without getchars :" +newsb[i]);
         
	}

}
