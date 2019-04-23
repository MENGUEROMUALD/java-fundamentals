package homework;

import java.util.Scanner;

public class BinarySearch24 {
	
	public int[] makeArray(int size) {
		int[] arr = new int[size];
		for(int i= 0; i< size; i++)
			arr[i] = i+1; //create a sorted array
		return arr;
	}

	public int find(int search, int[] array) {
		
	int lowIndex = 0;
	int highIndex = array.length -1;
	int middle = ( lowIndex+highIndex ) / 2 ;
	int result = -1;
	
	while((lowIndex <= highIndex) && result == -1 ){
		if(search == array[middle])
			result = middle;
		if(search > array[middle]){
			lowIndex = middle + 1;
	}
		else{
	highIndex = middle - 1;
	}
	middle = (lowIndex + highIndex + 1) / 2 ;
	}
	return result;
	}
	
	BinarySearch24 binSearch = new BinarySearch24();
		int[] array = binSearch.makeArray(10);
	//	System.out.println(binSearch.toString(array));
	
	Scanner read = new Scanner(System.in);
	
	/*int search;
	while((search = read.nextInt()) != -1){
		int index = binSearch.find(search, array);
		if(index == -1){
			System.out.printf("%d not found in the array\n",search);
	}
		else{
	System.out.printf("%d found at position %d in the array\n", search, index);
	}
	}
	read.close();
}*/
}
