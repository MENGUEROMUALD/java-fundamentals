import java.util.Scanner;

public class MyfirstCode {


	//methode principal
	public static void main(String[] args) {
		int [] numbers = {2,5,4,50,99};
		calcul(numbers);
		
	}
	
	public static void calcul (int[] array){
		for(int i:array) {
			
			for(int a=100;a > array[i];a--) {
				System.out.println(array[i]);
			}
			
		}
	}
	
	
}
