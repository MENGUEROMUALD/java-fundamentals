package org.toubou;

/**
 * For matrix multiplication to take place, the number of columns of first matrix 
 * must be equal to the number of rows of second matrix. 
 * In our example, i.e.c1 = r2
 * Also, the final product matrix is of size r1 x c2, i.e. product[r1][c2]
 * 
 * @author jeansylvain.toubou
 *
 */

public class Lesson9Ass {

	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 1;
        int[][] firstMatrix = { {1,3,7}, {3, 0, -1} };
        int[][] secondMatrix = { {1}, {2}, {3} };

        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

	}

}
