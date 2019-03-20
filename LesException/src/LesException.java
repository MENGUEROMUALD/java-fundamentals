
public class LesException {

	public static void main(String[] args) {
		doDifferent(); 

	}
	
	
	public static void doDifferent() throws ArithmeticException {
		int first = 9;
		int second=10;
		int diff =first/second;
		throw new UnsupportedOperationException("Operation Not Supportedd");
	}
	
}
