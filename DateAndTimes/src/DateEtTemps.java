import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class DateEtTemps {
	public static void main(String args[]){
	      Date d = new Date();
	      Date dateclone = (Date)d.clone();
	     
	     
	      System.out.println(d.compareTo(new Date(System.currentTimeMillis()-2)));
	      System.out.println(d.compareTo(dateclone));
	      System.out.println(d.compareTo(new Date(System.currentTimeMillis())));
	      System.out.println(d.compareTo(new Date(System.currentTimeMillis() + 1)));
	      System.out.println("---------");
	      System.out.println(d.getTime());
	      long i =d.getTime();
	      System.out.println("---------");
	    
	      Date y= new Date();
	      long w=y.getTime();
	      System.out.println("--------- intervall");
	      System.out.println("the elapse time is :");
	      long result = w - i;
	      System.out.println(result);
	      System.out.println("----------------");
	      System.out.println("in the past we have ");
	      System.out.println(d);
	      System.out.println("--------- set time in the futur");
	      d.setTime(System.currentTimeMillis()+300000);
	      System.out.println(d);
	      System.out.println("----------------format ");
	      Date date=new Date();
	      SimpleDateFormat sdf= new SimpleDateFormat("d/MM/y H:mm");
	      System.out.println(sdf.format(date));
	      String laDate = sdf.format(date);
	      System.out.println("++++++");
	      System.out.println(laDate);
	      System.out.println("++++++");
	      System.out.printf("Curent Date is %tc \n",date);
	      System.out.println("---------------- gregorians ");
	      GregorianCalendar gcalendar = new GregorianCalendar(Locale.getDefault());
	      System.out.printf("Gregorian calendar %s \n", gcalendar.getTime());
	      //gcalendar.add(GregorianCalendar.DAY_OF_MONTH, 20);
	      System.out.println("----------------  ");
	      System.out.printf("GregorianCalendar %d \n",gcalendar.get(GregorianCalendar.DAY_OF_MONTH));
	      ////////////////////////////////////////
	      System.out.println(d.before(new Date()));
	      System.out.println(d.before(y));
	      System.out.println(d);
	      System.out.println("----------------  ");
	      System.out.println(y);
	      Clock clock =Clock.systemDefaultZone();
	      LocalDateTime lcdt =LocalDateTime.now(clock);
	      System.out.printf("Date/Time %s\n",lcdt);
	      System.out.println("----------------  ");
	      ZoneId zooneId =ZoneId.systemDefault();
	      TimeZone tz=TimeZone.getTimeZone("Africa/Nairobi");
	      LocalDateTime lcd=LocalDateTime.now(tz.toZoneId());
	      System.out.printf("Date/Time %s\n",lcd.toString());
	      System.out.println("----------------");
	      LocalDate epoque=LocalDate.ofEpochDay(1000);
	      System.out.println("Date: " +epoque);
	     lcd.withDayOfMonth(25);
	     System.out.println("--------------");
	     System.out.println("day of the motnh "+lcd);
	     lcd.withDayOfYear(10);
	     System.out.println("with day of year " + lcd);
	     lcd.minusWeeks(52);
	     System.out.println("minus weeks "+lcd);
	     System.out.println("-----------------");
	     Period period =Period.of(2, 0, 0);
	     System.out.println("period "+period);
	     Period p4months=Period.ofMonths(4);
	     Period secondPeriod=Period.ofMonths(4);
	     System.out.println("period of months "+p4months);
	     System.out.println("with hour " + period.getUnits());
	     System.out.println("----------");
	     Period betweenPreriod =Period.between(LocalDate.now(), LocalDate.of(2018, 03, 13));
	     Duration dur =Duration.ofSeconds(59);
	     Duration SDur = Duration.between(LocalDate.now(), LocalDate.of(2019, 03, 14));
	    		 
	    }
	

}
