package org.toubou;

public class Lesson9Ex {

	public static void main(String[] args) {
		
		char[][][] chars= {
				{
					{'a','b','c'}
				},
				{
					{'d','e','f'}
				},
				{
					{'g','h','i'}
				}
				
		};
		 for (char[][] array2D: chars) {
		        for (char[] array1D: array2D) {
		           for(char item: array1D) {
		              System.out.println(item);
		           }
		        }
		     }

	}

}
