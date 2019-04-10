
public class Increasing {

	public static void main(String[] args) {
		int[] array= {1,7,4};
		System.out.println(array(array));
	}
	
	
	public static boolean array(int[] array) {
		if(array.length<=1) {
			return false;
		}
		int sum=0;
		int endIndex=1;
		while(endIndex<array.length) {
			for(int i=0;i<endIndex;) {
				sum+=array[i++];
				if(sum>array[endIndex]) {
					return false;
				}
			}
			endIndex++;
			sum=0;
		}
		return true;
		
	}

}
