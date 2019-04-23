package homework;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PersonalPractice {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		Student[] stu = new Student[5];
		stu[0] = new Student("uduma", 01);
		stu[1] = new Student("mary", 02);
		stu[2] = new Student("daisy", 03);
		stu[3] = new Student("mamo", 04);
		stu[4] = new Student("anne", 05);
		
		for(int a = 0; a < stu.length; a++)
			System.out.println(stu[a].toString());
		
		for(Student i: stu) {
			System.out.println(i);
		}
		
		
		
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0;
		try {
		Thread.sleep(5000);
		System.out.printf("5 seconds later %s\n", new Date());
		elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed Time in millis "+elapsedTime);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	//===============================generating mtn numbers using random==================================//
		System.out.println("");
		Random rand = new Random();       
		int numb = 0;
		int[] mtn = new int[2];
		mtn[0]=6;
		mtn[1]=5;
		int j;
		for (int y = 0; y <= 4; y++) {
			 j = rand.nextInt(2);
			System.out.print(mtn[j]);
		
		for(int a = 0; a <= 7; a++) {
		numb = rand.nextInt(9);
		System.out.print(numb);
		}
		System.out.println("");
		}
	//===================================================================================================//
		
	}

	public static <T> void listArray(T[] array) {
		for (T item : array)
			System.out.printf("\n%s", item.toString());
	}
}
