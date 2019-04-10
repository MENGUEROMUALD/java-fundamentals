
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyThread firstThread=new MyThread("first Thread");
		MyThread SecondThread=new MyThread("second Thread",firstThread);
		Thread t1=new Thread(firstThread);
		Thread t2=new Thread(SecondThread);
		firstThread.start();
		SecondThread.start();*/
		Conversation conversation = new Conversation();
		Mthread mthread1 = new Mthread("fist",conversation);
		OtherThred otherThred = new OtherThred("second",conversation);
		mthread1.start(); 
		otherThred.start();
		
	}

}
