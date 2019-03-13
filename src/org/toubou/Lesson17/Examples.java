package org.toubou.Lesson17;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Examples {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();

		Date dateClone = (Date) d.clone();
		
		System.out.println(("Interval of times Before sleep: " +((new Date()).getTime()-d.getTime())/1000) +" s");
		/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		

		System.out.println(("Interval of times After sleep: " +((new Date()).getTime()-d.getTime())/1000) +" s");
		
		System.out.println(d.compareTo(new Date(System.currentTimeMillis() -2)));

		System.out.println(d.compareTo(dateClone));

		System.out.println(d.compareTo(new Date(System.currentTimeMillis() + 1)));
		
		System.out.println(d);
		d.setTime(System.currentTimeMillis() + (1000*60*5) );
		System.out.println(d.toString());
		

		Date nowDate = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm a z");

		System.out.println(sdf.format(nowDate) );

		System.out.printf("Current Date is %tc", nowDate);
		System.out.println();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-dd-mm");

		String dateString = "2018-15-10";

		Date mDate = sdf1.parse(dateString); //converts the string to a date


		System.out.printf("parsed as: %ty\n", mDate);
		

		GregorianCalendar gCalendar = (GregorianCalendar) Calendar.getInstance();
		
		System.out.printf("Gregorian Calendar %s\n", gCalendar.getTime()); 
		

		GregorianCalendar gCalendar1 = new GregorianCalendar(2018, 02, 27);
		String[] weekday = new DateFormatSymbols().getWeekdays();
		
		System.out.printf("Gregorian Calendar %s\n", weekday[gCalendar1.get(GregorianCalendar.DAY_OF_WEEK)]); 
		
		
		GregorianCalendar birthdate = new GregorianCalendar(1999, 1, 1);
	    GregorianCalendar today = new GregorianCalendar(); // Today's date
	    GregorianCalendar birthday = new GregorianCalendar(today.get(GregorianCalendar.YEAR), birthdate.get(GregorianCalendar.MONTH),
	        birthdate.get(GregorianCalendar.DATE));
	    int age = today.get(GregorianCalendar.YEAR) - birthdate.get(GregorianCalendar.YEAR);
	    String[] weekdays = new DateFormatSymbols().getWeekdays(); // Get day names
	    System.out.println("You were born on a " + weekdays[birthdate.get(GregorianCalendar.DAY_OF_WEEK)]);
	    System.out.println("This year you " + (birthday.after(today) ? " will be " : "are ") + age
	        + " years old.");
	    System.out.println("In " + today.get(GregorianCalendar.YEAR) + " your birthday "
	        + (today.before(birthday) ? "will be" : "was") + " on a "
	        + weekdays[birthday.get(GregorianCalendar.DAY_OF_WEEK)] + ".");

	    

		ZoneId zoneId = ZoneId.systemDefault();
		
		TimeZone tz = TimeZone.getTimeZone("Africa/Nairobi");
		
		//LocalDateTime lcd = LocalDateTime.now(tz.toZoneId()).withDayOfMonth(31);
		LocalDateTime lcd = LocalDateTime.now(tz.toZoneId()).plus(10, ChronoUnit.DAYS);

			//LocalTime lcd = LocalTime.now(tz.toZoneId());
		
		System.out.printf("Date/Time %s\n", lcd.toString());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(lcd.format(formatter));
		

			Instant instant = Instant.now();
			System.out.printf("Instant now %s\n", instant);
			
			instant=instant.plusSeconds(60);
			
			System.out.println(instant);
           
			Period period = Period.of( 0, 1, 0);

			System.out.printf("Period %s\n", period.getMonths());


			Period p4months = Period.ofMonths(4);

			System.out.println(p4months.getMonths());
			
			Period period1 = Period.between( LocalDate.now() ,
			LocalDate.of(2019, Month.NOVEMBER, 12));


			System.out.printf("Period %s\n", period1);
		

			LocalDate lDate = LocalDate.now().plus(period1);
			
			System.out.printf("Date %s\n", lDate);
			Duration dur = Duration.ofSeconds(59); //  a 59 minute duration object

			Duration sDur = Duration.between(LocalTime.now(), LocalTime.MIDNIGHT);


			System.out.printf("Date %s\n", dur.getSeconds());

			System.out.println(sDur.toHours());
			
		/*Date d =new Date();
		Date d1=new Date();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(d.before(new Date()));
		
		System.out.println(d.before(d1));
		
		
		System.out.println(d.compareTo(new Date()));
		
		System.out.println((new Date()).compareTo(d));
		
		System.out.println(d.compareTo(d1));
		
		System.out.println(d);
		System.out.println(d1);
		*/
		
	}

}
