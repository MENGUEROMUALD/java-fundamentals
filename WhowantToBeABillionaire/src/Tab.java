import java.util.Arrays;

public class Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] tableau = {1,2,3,5,4,8};
		int max=0;
		for(int i =0;i<tableau.length;i++) {
			if(max<tableau[i]) {
				
				max=tableau[i];
				
			}
		}
		System.out.println(max);*/
		int[] fullNumber= {15,45,78};
		Arrays.sort(fullNumber);
		for(int i :fullNumber) {
			System.out.println(i);
		}
		 
		//int [][] twoDimension = {{4,5,50},{3,-9,8},{12,0,55}};
		
		int [][][] twoDimension = {{{4,5,50},{3,-9,8},{12,0,55}}};
		for(int [][] i:twoDimension) {
			
			for(int[] j: i) {
				
				for(int k:j) {
					
					System.out.println(k);
					
				}
				
			}
			
		}
		
		//carre(4,2,3);
		
		
		
	}
	public static int[] carre(int number,int numbertwo,int numberThree) {
		
		number =number*number;
		numbertwo =numbertwo*numbertwo;
		numberThree =numberThree*numberThree;
		int[] fullNumber= {number, numbertwo, numberThree};
		for(int i=0;i<fullNumber.length;i++) {
			System.out.println(fullNumber[i]);
		}
		
		return fullNumber;	
		
	}
	

}
