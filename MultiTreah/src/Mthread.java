
public class Mthread extends Thread{
	
	private String threadName;

	public Mthread(String threadName,Conversation converse) {
		super();
		this.converse = converse;
		this.threadName=threadName;
	}

	private Conversation converse;
	
	static String[] questions = {"Hello", "How are you doing?", "How old are you?", "Do you write code?"};
	
	public void run() {
		
		for(int i=0; i< questions.length; i++){
		try {
			
		Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			
		e.printStackTrace(); 
		}
		converse.ask(getName(), questions[i]);
		
			} 
		
		}
	
	
}


