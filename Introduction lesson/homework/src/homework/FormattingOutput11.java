package homework;

import java.util.Calendar;
import java.util.Formatter;

public class FormattingOutput11 {
	
	public static void main(String[] args) {
		
		System.out.printf("%d\n",20);
		System.out.printf("%d\n",-20);
		System.out.printf("%d\n",+20);
		System.out.printf("%o\n",20);
		System.out.printf("%x\n",20);
		System.out.printf("%dX\n",20);
		System.out.println(" ");
		
		System.out.printf("%e\n",0.314159265358);
		System.out.printf("%e\n",123456789.25);
		System.out.println(" ");
		
		System.out.printf("%E\n",0.314159265358);
		System.out.printf("%E\n",123456789.25);
		System.out.println(" ");
		
		System.out.printf("%5f\n",0.314159265358);
		System.out.printf("%f\n",123456789.25);
		System.out.println(" ");
		
		System.out.printf("%g\n",0.314159265358);
		System.out.printf("%G\n",123456789.25);
		System.out.println(" ");
		
		System.out.printf("%a\n",0.314159265358);
		System.out.printf("%A\n",123456789.25);
		System.out.println(" ");
		
		System.out.printf("%s\n","Seven Academy");
		System.out.printf("%s\n",12345);
		System.out.printf("%c\n",'A');
		System.out.println(" ");
		
		System.out.printf("%S\n","Seven Academy");
		System.out.printf("%C\n",'a');
		System.out.println(" ");
		
		Integer score = 300;
		System.out.printf("%s\n", score);
		System.out.println("");
		
		Calendar calendar = Calendar.getInstance();
		System.out.printf("%tc\n",calendar);
		System.out.printf("%tF\n",calendar);
		System.out.printf("%tD\n",calendar);
		System.out.printf("%tr\n",calendar);
		System.out.printf("%tT\n",calendar);
		System.out.println("");
		
		System.out.printf("%1$tA,%1$tB %1$tY\n",calendar);
		System.out.printf("%1$TA,%1$TB %1$TY\n",calendar);
		System.out.printf("%1$ta,%1$tb %1$ty\n",calendar);
		System.out.println("");
		
		System.out.printf("%1$tH:%1$tM %1$tS\n",calendar);
		System.out.printf("%1$tZ %1$tl:%1$tM:%1$tS\n",calendar);
		System.out.println("");
		
		System.out.printf("%%\n");
		System.out.printf("%1$h,%1$H\n",calendar);
		System.out.printf("%b,%1$B %2$b\n",calendar,null);
		System.out.println("");
		
		float floatingPoint = (float) 123.456439;
		System.out.printf("%9.3f\n", floatingPoint);
		System.out.println("");
		
		System.out.printf("%9.3f\n", floatingPoint);
		System.out.printf("%3g\n", floatingPoint);
		System.out.printf("%3e\n", floatingPoint);
		System.out.println("");
		
		System.out.printf("%2d\n",12345);
		System.out.printf("%3d\n",12345);
		System.out.printf("%4d\n",12345);
		System.out.printf("%4d\n",-12345);
		System.out.printf("%4d\n",-123);
		System.out.println("");
		
		System.out.printf("%.4s\n","what is your name?");
		System.out.println("");
		
		System.out.printf("%+d\t %+d\n",123,-123); // using the + flag
		System.out.printf("%10f\n",12345.3); //omitting the flag and using f
		System.out.printf("%-5c\n",'4'); // using the minus flag
		System.out.printf("%4d\n",12345);
		System.out.printf("% d % d\n",12345, -12345); //space flag test
		System.out.printf("%#o\n",12345); // the # flag
		System.out.printf("%#x\n",-12345);
		System.out.println("");
		
		System.out.printf("%+09d\t",123); // +,0 and space flags
		System.out.printf("%09d\n",123); // only 0 and space flags
		System.out.printf("% 9d\n",123); // space flag only
		System.out.println("");
		
		System.out.printf("%,d\t",1230); // the comma flag
		System.out.printf("%,.2f\n",1230.9812);
		System.out.printf("%,.2f\n",123.4);
		System.out.println("");
		
		System.out.printf("%(d\n",1230); // the open paranthesis (
		System.out.printf("%(d\n",-123);
		System.out.printf("%(.2e\n",-123.4);
		System.out.println("");
		
		Formatter formatter = new Formatter();
		formatter.format("%d = %#o =%#X", 7,7,7);
		System.out.println(formatter.toString());
		System.out.println("");
		
		System.out.println(String.format("%d = %#o = %#X", 5,5,5)); //using format static method in class string
		
	}

}
