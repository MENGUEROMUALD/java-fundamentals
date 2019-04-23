package homework;

import java.text.*;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class practo {

	public static void main(String[] args) {
		
		Duration dur = Duration.ofSeconds(59); // a 59 minute duration object
		Duration sDur = Duration.between(LocalTime.now(), LocalTime.MIDNIGHT);
		System.out.printf("Date %s\n", dur.getSeconds());
		System.out.println(sDur.toHours());

	}

}
