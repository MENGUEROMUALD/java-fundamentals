package homework;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DatesAndTime17 {

	public static void main(String[] args) throws InterruptedException, ParseException {
		
		Date d = new Date();
		Thread.sleep(2000);
		System.out.println(d.after(new Date(2019,03,11)));
		
		System.out.println(d.before(new Date()));
		
		Date dateClone = (Date) d.clone();
		System.out.println(dateClone.toString());
		System.out.println(d);
		
		System.out.println(d.compareTo(new Date(System.currentTimeMillis() -2)));
		System.out.println(d.compareTo(dateClone));
		System.out.println(d.compareTo(new Date(System.currentTimeMillis() +1)));
		System.out.println(d);
		System.out.println(new Date(System.currentTimeMillis() +5000));
		
		//System.out.println(d.compareTo(new String("Hello!"))); error, dates can't compare to string
		
		
		long before = d.getTime();
		//Thread.sleep(2000);
		Date y = new Date();
		long after = y.getTime();
		long result = after - before;
		System.out.println(result);
		System.out.println("");
		
		//setting time 5 mins earlier.
		System.out.println(new Date(System.currentTimeMillis()+1000*60*5));
		
		System.out.println("");
		
		
		
		
		d.setTime(System.currentTimeMillis() + 100 ); // a time, some 100 milliseconds in the future// no display
		System.out.println(d.toString());
		System.out.println("");
		
		
		
		
		
		Date nowDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("y/M/d");
		System.out.println(sdf.format(nowDate));
		
		System.out.printf("Current Date is %tc", nowDate);
		System.out.println("");
		
		
		
		
		
		
		
		  SimpleDateFormat sf = new SimpleDateFormat("yyyy-dd-mm"); 
		  String dateString ="2018-15-10"; 
		  Date mDate = sf.parse(dateString); //converts the string to a date 
		  System.out.printf("parsed as: %s\n", mDate.toString());
		 
		
		
		
		
		
		System.out.printf("\nNow %s ….\n", new Date(0));
		Thread.sleep(5000); //wait for 5 seconds before displaying the next date
		System.out.printf("5 seconds after %s … \n", new Date(0));
		
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0;
		
		try {
		Thread.sleep(5000);
		System.out.printf("5 seconds later %s\n", new Date(elapsedTime));
		elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed Time in millis "+elapsedTime);
		} 
		catch (InterruptedException e) {
		e.printStackTrace();
		}
		
		/*
		 * GregorianCalendar gCalendar = (GregorianCalendar) Calendar.getInstance();
		 * System.out.printf("Gregorian Calendar %s\n", gCalendar); // wrong output
		 * 
		 * GregorianCalendar gCalendar1 = new GregorianCalendar();
		 * System.out.printf("Gregorian Calendar %s\n", gCalendar1.toString());//output
		 * different
		 */
		
		
	
	  System.out.println(""); GregorianCalendar gCalendar2 = new
	  GregorianCalendar(2018, 02, 28); System.out.printf("Gregorian Calendar %s\n",
	  gCalendar2.getTime());
	  
	  GregorianCalendar gCalendar3 = new GregorianCalendar(2018, 11, 28, 12,12,12);
	  System.out.printf("Gregorian Calendar %s\n", gCalendar3.getTime());
	  
	  GregorianCalendar gCalendar4 = new GregorianCalendar(2018, 11, 28, 12,30);
	  System.out.printf("Gregorian Calendar %s\n", gCalendar4.getTime());
	  
	  GregorianCalendar gCalendar5 = new GregorianCalendar(Locale.getDefault());
	  System.out.printf("Gregorian Calendar %s\n", gCalendar5.getTime());
	  System.out.println("");
	  
	  
	  
	  
	  
	  
	  TimeZone tz = TimeZone.getTimeZone("Africa/Lome"); GregorianCalendar
	  gCalendar6 = new GregorianCalendar(tz);
	  System.out.printf("Gregorian Calendar %s\n", gCalendar6.getTime());
	  
	  TimeZone tzz = TimeZone.getTimeZone("America/Los_Angeles"); Locale[] lcs =
	  GregorianCalendar.getAvailableLocales(); GregorianCalendar gCalendar7 = new
	  GregorianCalendar(tzz, lcs[2]); System.out.printf("Gregorian Calendar %s\n",
	  gCalendar7.getTime());// gave local time still
	  
	  GregorianCalendar gCalendar8 = new GregorianCalendar();
	  gCalendar8.add(GregorianCalendar.DAY_OF_MONTH, 20);
	  System.out.printf("Gregorian Calendar %s\n", gCalendar8.getTime());
	  
	  GregorianCalendar gCalendar9 = new GregorianCalendar();
	  gCalendar9.add(GregorianCalendar.DAY_OF_MONTH, 20);
	  System.out.printf("Gregorian Calendar %d\n",gCalendar9.get(GregorianCalendar.
	  DAY_OF_MONTH));
	  
	  
	  
	  
	  GregorianCalendar gCalendar11 = new GregorianCalendar();
	  System.out.printf("Gregorian Calendar %d\n",gCalendar11.getActualMaximum(
	  GregorianCalendar.HOUR));
	  
	  GregorianCalendar gCalendar12 = new GregorianCalendar();
	  System.out.printf("Gregorian Calendar %d\n",gCalendar12.getActualMinimum(
	  GregorianCalendar.HOUR));
	  
	  GregorianCalendar gCalendar13 = new GregorianCalendar();
	  System.out.printf("Gregorian Calendar %d\n",gCalendar13.getMaximum(
	  GregorianCalendar.HOUR));
	  
	  GregorianCalendar gCalendar14 = new GregorianCalendar();
	  System.out.printf("Gregorian Calendar %d\n", gCalendar14.getTimeInMillis());
	  
	  
	  
	  
	  GregorianCalendar gCalendar15 = new GregorianCalendar();
	  //System.out.printf("Gregorian Calendar %d\n",gCalendar15.getTimeZone().getDisplayName()); Error
	  
	  
	  
	  
	  
	  GregorianCalendar gCalendar16 = new GregorianCalendar();
	  System.out.printf("Leap year %b\n", gCalendar16.isLeapYear(2018));
	  System.out.println("");
	  
	  
	  
	  
	  
	  GregorianCalendar gCalendar17 = new GregorianCalendar();
	  System.out.println(gCalendar17.getTime());
	  gCalendar17.roll(GregorianCalendar.HOUR, true);
	  System.out.printf("Leap year %s\n", gCalendar17.getTime());
	  
	  GregorianCalendar gCalendar18 = new GregorianCalendar();
	  gCalendar18.set(GregorianCalendar.HOUR, 2);
	  System.out.printf("Date/Time %s\n", gCalendar18.getTime());
	  
	  GregorianCalendar gCalendar19 = new GregorianCalendar();
	  gCalendar19.setTime(new Date(121311200)); System.out.printf("Date/Time %s\n",
	  gCalendar19.getTime()); System.out.println("");
	 
		
		Clock clock = Clock.systemDefaultZone();
		LocalDateTime lcd = LocalDateTime.now();
		LocalDateTime lcd1 = LocalDateTime.now(clock);
		System.out.printf("Date/Time %s\n", lcd.toString());
		System.out.println(lcd1.toString());
		System.out.println("");
		
		ZoneId zoneid = ZoneId.systemDefault();      // different timezone by country
		TimeZone tz1 = TimeZone.getTimeZone("Africa/Ghana"); 
		LocalDateTime lcd3 = LocalDateTime.now(tz1.toZoneId());
		System.out.printf("Date/Time %s\n",lcd3.toString());
		
		
		ZoneId zoneId = ZoneId.systemDefault();
		TimeZone tz4 = TimeZone.getTimeZone("Africa/Nairobi");
		LocalDate lcd4 = LocalDate.now();
		LocalDate date = LocalDate.ofEpochDay(10);
		System.out.printf("Date %s\n", lcd4.toString());
		System.out.println("Date "+date);
		System.out.println("");
		
		TimeZone tz2 = TimeZone.getTimeZone("Africa/Douala");
		LocalDate ld = LocalDate.now();
		LocalDate month = ld.withDayOfMonth(20);   // a chosen day of the month
		System.out.println("Date " +month);
		
		LocalDate year = ld.withYear(2020);        // same day in a chosen year
				System.out.println("Date "+year);
				
		LocalDate week = ld.minusWeeks(11);      // minus number of weeks from present date.
		System.out.println("Date "+week);
		System.out.println("");
		
		
		Period period = Period.of( 2, 1, 1);
		System.out.printf("Period %s\n", period);
		
		
		Period p4months = Period.ofMonths(4);
		//p4months.getMonths()
		System.out.println(p4months);
		
		
		Period periods = Period.between( LocalDate.now() ,
				LocalDate.of(2018, Month.NOVEMBER, 12));
				System.out.printf("Period %s\n", periods);
		
		
		
		
		

	}

}
