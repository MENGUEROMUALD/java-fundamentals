import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;

public class MyHorloge{
	public static void main(String[] args) {
		System.out.println("horloge");
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("H:mm");
		 Clock clock =Clock.systemDefaultZone();
	     LocalDateTime lcdt =LocalDateTime.now(clock).plusMinutes(10);
		boolean time=true;
		System.out.println(sdf.format(date));
	    String laDate = sdf.format(date);
		while(time==true) {  
		try {
				
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		date.setTime(System.currentTimeMillis());
		System.out.println(date);
		System.out.println("with 10 minute "+ lcdt);
			
		}
	      
		
	}
 
 
}