package homework;

public class Arrays9base {
	
	int[] numbers = {1,2,3,4,5,6};
	public int[] increaseValue() {
		for(int a=0;a<numbers.length;a++)
			numbers[a]=numbers[a]*2;
		return numbers;
	}
	int[] values = increaseValue();
	
	public int getLength(int[]arr) {
		System.out.println(arr.length);
		return arr.length;
	}
	//getLength(numbers);
	
	public Arrays9base() {
		
	}

}
