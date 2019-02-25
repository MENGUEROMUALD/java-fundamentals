
public class Matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [][]matriceOne = {{1,3,7},{3,0,-1}};
			int [][]matriceTwo= {{1},{2},{3}};
			int [][]tableauResultat = new int [2][1];
			for (int i=0;i<2;i++) {
				for(int j=0;j<1;j++) {
					for(int k =0 ;k<3;k++) {
						tableauResultat[i][j] += matriceOne[i][k] * matriceTwo[k][j];
					}
					
				}
				
			}
			System.out.println("nous avons donc");
	        for(int[] ligne : tableauResultat) {
	            for (int colonne : ligne) {
	                System.out.println(colonne + "  ");
	            }
	            System.out.println();
	           
	        }
	        System.out.println("-----------------***---------------");
	}

}
