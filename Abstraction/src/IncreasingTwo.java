
public class IncreasingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,5};
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
