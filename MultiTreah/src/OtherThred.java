
public class OtherThred extends Thread{
	private Conversation converse;
	private String threadName;

	public OtherThred(String threadName,Conversation converse) {
		super();
		this.converse = converse;
		this.threadName=threadName;
	}
	static String[] answers = {"Hi!", "I am doing fine. Thank you!", "I am 13", "No, I live in code."};
	
	public void run() {
		
		for(int i=0; i< answers.length; i++){ converse.ask(getName(), answers[i]);
		
		try {
			
		Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			
		e.printStackTrace(); 
			}
		} 
	}

}
