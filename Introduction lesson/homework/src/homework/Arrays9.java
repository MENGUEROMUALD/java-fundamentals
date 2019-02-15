package homework;

import java.util.Arrays;

public class Arrays9 {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6};
		System.out.println(numbers[0]);//prints the number at index 0
		
		for (int i = 0; i < 6; i++)
			System.out.println(i);//prints out the numbers in array using for loop
		
		for (int i: numbers)
			System.out.println(i);//prints out the number in array using foreach loop
		
		int sum = 0;
		for (int i: numbers)
			sum+=i;
		System.out.println(sum);//prints the sum of all the numbers in the array
		
		int max = 0;
		for (int i:numbers)
			if(max<i);
			//max = i;
			System.out.println("Maximum is : "+max);//finds the maximum number in the array(faulty)
			
		System.out.println("Length : "+numbers.length);// the length of numbers in the array
		
		System.out.println(Arrays.binarySearch(numbers, 3));// returns the index of the number found
		
		int[] number = {1,2,3,4,5,6};
		System.out.println(Arrays.equals(numbers, number));// compares the two arrays and return a boolean
		
		int[] a1= {3,1,5,2,6,4};
		Arrays.sort(a1);
		System.out.println(a1);// Sorts the array in increasing natural order(faulty)
		
		Arrays.fill(a1, 1);
		System.out.println(a1);//Assigns 1 to each of the values in the Array (faulty)
		
		Arrays9base array = new Arrays9base();
		array.increaseValue();
		
		// MATRICES = ARRAYS WITH MULTIDIMENSIONS
		
		//EXERCISE
		
		/*
		 * char[][][] chars = {{{a,b,c}},{{d,e,f}},{{g,h,j}}};
		 * System.out.println(chars);
		 * 
		 * // HOMEWORK
		 * 
		 * int[][] h = {{{1,3,7}},{{3,0,-1}}}; int[][][] y = {{{1}},{{2}},{{3}}};
		 * int[][][] z = int[][] h * int[][][] y;
		 */
		
	}
		
}
