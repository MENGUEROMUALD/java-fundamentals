import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comparable(reverse(131),reverse(122));
		//System.out.printf("%.5f\n", 0.314159265358);
		//System.out.printf("%f\n", 123456789.25);
		//System.out.printf("%g\n", 0.314159265358); 
		//System.out.printf("%G\n", 123456789.25);
		//System.out.printf("%a\n", 0.314159265358); 
		//System.out.printf("%A\n", 123456789.25);
		//System.out.printf("%s\n", "SevenAcademy"); 
		//System.out.printf("%s\n", 12345); 
		//System.out.printf("%c\n", 'A');
		Calendar calendar = Calendar.getInstance(); 
		//System.out.printf("%tc\n", calendar);
		//System.out.printf("%tF\n", calendar);
		//System.out.printf("%tD\n", calendar);
		//System.out.printf("%tr\n", calendar);
		//System.out.printf("%tT\n", calendar);
		//System.out.printf("%1$tA, %1$tB %1$td, %1$tY\n", calendar); 
		//System.out.printf("%1$TA, %1$TB %1$Td, %1$TY\n", calendar); 
		//System.out.printf("%1$ta, %1$tb %1$te, %1$ty\n", calendar);
		float floatingPoint =(float) 123.456439;
		System.out.printf("%9.3f\n", floatingPoint);
	}
	public static int reverse(int num) {
		int change=0;
		while(num!=0) {
			int temp = num%10;
			change=change*10+temp;
			num/=10;
		}
		return change;
	}
	
	public static void comparable(int numberOne,int numberTwo) {
		if(numberOne>numberTwo) {
		System.out.println(numberOne);
		}else {
			System.out.println(numberTwo);
		}
		
	}

}
