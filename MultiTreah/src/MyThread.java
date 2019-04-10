
public class MyThread implements Runnable{
	String threadName;
	Thread thread;
	MyThread otherThread;
	

	public MyThread(String threadName) {
		super();
		this.threadName = threadName;
		this.otherThread=this;
	}
	
	public MyThread(String threadName,MyThread thread) {
		super();
		this.threadName = threadName;
	}
	

	

	public static void main(String[] args) {
	
		

	}

	@Override
	public void run() {
		int sum =0;
		try {
			synchronized(thread) {for(int i=0; i< 10; sum+=i++){
				System.out.printf("%s is adding the first %d numbers. Waiting for 3 seconds\n", threadName, i);
				Thread.sleep(3000);
				if(i == 5 && otherThread != null)
				otherThread.wait(); //set thread in waiting state }
		}
			}
	}catch(InterruptedException | IllegalMonitorStateException ie) {
		
	}finally{
		System.out.println(threadName +"Stopping. Sum of all the numbers is " +sum);
		}
	}
	
	public void start() {
		System.out.println("Starting "+threadName); if(thread == null){
		thread = new Thread(this, threadName);
		thread.start(); 
		}
		}
}
