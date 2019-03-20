import java.util.ArrayList;

public class MainStack {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>(0);
		stack.push(20);
		stack.push(22);
		stack.push(300);
		try {
			stack.pop();
		} catch (StackErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
