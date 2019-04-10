
public class IncrisingArray {

	public static void main(String[] args) {
		int[] array= {1,1,4};
		
		array(array);

	}
	
	public static void array(int[] array) {
		for(int i=0;i<=array.length;i++) {
			for(int j=1;j<=array.length;j++) {
				for(int w=2;w<=array.length;w++) {
					int k=array[i]+array[j];
					int z=array[w];
					if(array[i]>=array[j]) {
						System.out.println("false");
						break;
					}else if(k>=z){
						System.out.println("false");
						break;
					}else if(z>k){
						System.out.println("vrai");
					}else {
						System.out.println("vrai");
						break;
					}
				}
			}
		}
		
	}
	

}
