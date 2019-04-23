package homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson17Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		for(;;) { //infinite for loop, change the time each time of the loop.
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" hh:mm:ss a\n E dd/MM/yyyy");
		System.out.println(sdf.format(d));
		Thread.sleep(1000);
		
		}
		//System.out.println("Time in 10 Minutes = "+new Date(System.currentTimeMillis()+1000*60*10));
		//can't be executed because of the infinite loop
	}

}
