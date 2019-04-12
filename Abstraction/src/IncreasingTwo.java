import java.util.Arrays;

public class IncreasingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,6,5};
		Arrays.sort(array);
		System.out.println(array[1]);
		System.out.println(array(array));
	}
	
	public static boolean array(int[] array) {
		if(array.length<=1){
			return false;
		}
		int sum=array[0];
		for(int i=1;i<array.length;i++) {
			if(sum>array[i]) {
				return false;
			}
			sum+=array[i];
		}
		return true;
	}

}
