package org.toubou;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson10Ex {
	
	public static void convertString(String string) {
		String pattern="\\s";
    	String pattern1="\\A";
    	String pattern2="\\z";
    	String pattern3="e{1,}";
    	
    	Pattern p = Pattern.compile(pattern);
    	Pattern p1 = Pattern.compile(pattern1);
    	Pattern p2 = Pattern.compile(pattern2);
        Pattern p3 = Pattern.compile(pattern3);
    	
    	Matcher m = p.matcher(string);
    	String string1=m.replaceAll("9");
    	Matcher m1 = p1.matcher(string1);
    	String string2=m1.replaceFirst("*");
    	Matcher m2 = p2.matcher(string2);
    	String string3=m2.replaceFirst("*");
    	Matcher m3 = p3.matcher(string3);
    	String string4=m3.replaceAll("E");
    	
    	System.out.println(String.format("old: %s \nNew : %s",string, string4 ));
    	
	}

	public static void main(String[] args) {

    	
		Scanner input1 = new Scanner(System.in);
    	System.out.println("Enter à string:");
    	String answer = input1.nextLine();
    	convertString(answer);
    	
    	

	}

}
