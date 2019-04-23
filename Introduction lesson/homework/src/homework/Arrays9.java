package homework;

import java.util.Arrays;

public class Arrays9 {

	public static void main(String[] args) {

		
		/*
		 * int [] numbers = {1,2,7,4,5,6}; System.out.println(numbers[0]);//prints the
		 * number at index 0
		 */
		/*
		 * for (int i = 0; i < 6; i++) System.out.println(numbers[i]);//prints out the
		 * numbers in array using for loop
		 * 
		 * for (int i: numbers) System.out.println(i);//prints out the number in array
		 * using foreach loop
		 * 
		 * int sum = 0; for (int i: numbers) sum+=i; System.out.print(sum);//prints the
		 * sum of all the numbers in the array System.out.println(" ");
		 * 
		 * 
		 * int max = 0; for (int i:numbers) if(max < i) max = i;
		 * System.out.println("Maximum is : "+max);//finds the maximum number in the
		 * array
		 * 
		 * // get the maximum number with the regular for loop..... Assignment
		 * 
		 * 
		 * 
		 * 
		 * int maxi = numbers[0]; for (int u = 0; u<numbers.length; u++) {
		 * if(numbers[u]> maxi) { maxi = numbers[u]; } }
		 * System.out.println(" Max is : "+maxi);
		 * 
		 */
		 

		/*
		 * System.out.println("Length : "+numbers.length);// the length of numbers in
		 * the array
		 * 
		 * System.out.println(Arrays.binarySearch(numbers, 3));// returns the index of
		 * the number found
		 * 
		 * int[] number = {1,2,3,4,5,6}; System.out.println(Arrays.equals(numbers,
		 * number));// compares the two arrays and return a boolean
		 * 
		 * int[] a1= {3,1,5,2,6,4}; Arrays.sort(a1); for (int u:a1) {
		 * System.out.println(u);// Sorts the array in increasing natural order(faulty)
		 * } Arrays.fill(a1, 1); for (int z:a1) {
		 * //System.out.println(Arrays.fill(a1,1);//Assigns 1 to each of the values in
		 * the Array (faulty) } Arrays9base array = new Arrays9base(); int[] y =
		 * array.getNumber(); for(int i:y) { System.out.println(i); }
		 */

		// MATRICES = ARRAYS WITH MULTIDIMENSIONS

		// EXERCISE
		int[] t = { 1, 2, 5, 3, 7, 9, 6 };
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

		int[][] q = { { 4, 5, 50 }, { 3, -9, 8 }, { 1, 0, 55 } };// 2 dimensional matrix.
		for (int a = 0; a < q.length; a++) {
			for (int b = 0; b < q[a].length; b++) {
				System.out.print(q[a][b] +" ");
			}System.out.println(" ");
		}
		System.out.println("" );
		/*
		 * char[][][] chars = { { { 'a', 'b', 'c' } }, { { 'd', 'e', 'f' } }, { { 'g',
		 * 'h', 'j' } } }; for (int p = 0; p < chars.length; p++);{ for (int o = 0; o <
		 * chars['p'].length; o++);{ for (int v = 0; v < chars['p']['o'].length; v++);{
		 * System.out.println(" "+chars['p']['o']['v']); } } }
		 */
		// HOMEWORK

		int[][] h = {{1,3,7},{3,0,-1}};
		for (int n = 0; n<h.length;n++) {
			for (int g =0; g<h[n].length; g++) {
				System.out.print(" "+h[n][g]);
			}System.out.println(" ");
		}
		System.out.println("");
		int[][][] y = {{{1}},{{2}},{{3}}};
		int mult = 0;
		for (int ya = 0;  ya<y.length; ya++) {
			for (int ua =0; ua<y[ya].length; ua++) {
				for (int ia =0; ia<y[ya][ua].length; ia++) {
					System.out.println(y [ya][ua][ia]);
				}
			}
		}
		int sum=0;
		int[][] p = {{1,3,7},{3,0,-1}};
		int[][][] o = {{{1}},{{2}},{{3}}};
		int[][][] result = new int [3][3][3];
		int add = 0;
		for (int i=0; i < 3; i++) {
			for (int j =0; j<p[i].length; j++) {
				
				for (int k=0; k<o.length; k++) {
					for (int l =0;l<o[k].length; l++) {
						
						sum+= (p[i][j])*(o[i][k][l]);
						result[i][j][k] = sum;
						System.out.println(result);
						
						 /*sum=sum+p[i][l]*o[l][j][k];{
							result[i][j][k]=sum;
							System.out.println(result);*/
						}
						
					}
				}
			}
		}

}
