package org.toubou.Lesson17;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson17Ass {

	public static void main(String[] args) {
       for(;;) {
    	   
	    	try {
	   			Thread.sleep(1000);
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		}
			Clock clock = Clock.systemDefaultZone();
			LocalDateTime lcd = LocalDateTime.now(clock).plusMinutes(10);
			LocalDateTime lcd1 = LocalDateTime.now(clock);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			System.out.printf("Date/Time %s\n", lcd1.format(formatter)); 
			System.out.printf("Date/Time in 10 minutes %s\n",lcd.format(formatter));
	       }

	}

}
