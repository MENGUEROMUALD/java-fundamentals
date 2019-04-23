package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ExamPrep {

	public static void main(String[] args) {
		// program to find commom elements in 2 arrays and show the index in both arrays. using generic array.
		// second highest element in an array.
		// convert an array to arraylist.
		// what a program that computes the average of an array except the largest and smallest.
		String[] a = {"one","two","three","four","five"};
		String[] b = {"one","three","five","seven","nine"};
		
		int[] y = {1,3,4,2,6,7};
		int z = 0;
		Arrays.parallelSort(y);
		System.out.println(y[(y.length)-2]);
		//for(int i = 0; i < y.length; i++) {
			//System.out.println(y[i]);
			//if(i > z) 
				//z = i;
			//}
			//System.out.println(y[z]);
		
		//ExamPrep.same(a, b);

		ExamPrep.average(y);
	}
	public static int average(int[] a) {
		Arrays.sort(a);
		int sum = 0;
		for(int q = 1; q < a.length-2; q++)
			sum  = (sum + a[q]);
		return sum;
	}
	public static ArrayList convert(int[] a){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int t = 0; t < a.length; t++)
			list.add(a[t]);
		return list;
	
	}
	
	public static <T> void same(T[] a, T[] b) {
		for (int s = 0; s < a.length; s++) 
			for (int h = 0; h < b.length; h++) 
				if(a[s].equals(b[h])) 
					System.out.println("index "+s+" of a equals index "+h+" of b-- ");		
			}
}
