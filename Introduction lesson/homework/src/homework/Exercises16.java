package homework;

import java.util.Random;

public class Exercises16 {
	
	
	public int max(int a, int b, int c) {
		
		//return a>b ? max (a,c) : max(b,c);// another option
		
		int d = a > b ? a : b;
		int max = d > c ? d : c;
		return max; 
	}
	
	

	public static void main(String[] args) {
		
		Exercises16 Ex = new Exercises16();
		System.out.println(Ex.max(4,9,7));
		
		int max = 0;
		int index = 0;
		String[] array = {"there","is","a","greenhill","far","away"};
		for(int i = 0; i < array.length; i++)
			/*
			 * System.out.println(array[i]); System.out.println(array.length);
			 * System.out.println(array[0].length());
			 */
		
		if (max < array[i].length()) {
			max = array[i].length();
		index = i ;
		
		}
		
		System.out.println("the longest word is "+array[index]);
		
		
		//Trying to generate random 7 mtn and 8 orange numbers
		int[] m = {7,5};
		int[] o = {9,6};
		int[] n = {0,1,2,3,4,5,6,7,8,9};
		for(int l = 0; l < 2; l++)
			System.out.println(m[l]);
		for (int k = 0; k < 2; k++)
			System.out.println(o[k]);
		System.out.println("");
		
		Random r = new Random();
		for (int i = 0; i < 8; i++) {
			int rand = r.nextInt(9);
			int d = n[rand];
			
			System.out.print(d);
		
		}
		
	}

}
