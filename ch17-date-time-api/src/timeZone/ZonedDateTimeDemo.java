package timeZone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		/*
		 * LocalDateTime
		 */
		//show time to minute unit
		LocalDateTime tpNow = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
		System.out.println("Now in Taipei: " + tpNow);
		
		/*
		 * ZonedDateTime
		 */
		//show New York time
		ZoneId newYork = ZoneId.of("America/New_York");
		ZonedDateTime nyNow = ZonedDateTime.now(newYork).truncatedTo(ChronoUnit.MINUTES);
		System.out.println("Now in New York: " + nyNow);
		
		//show time difference and time zone
		System.out.println("Offset of New York:" + nyNow.getOffset());
		System.out.println("Time Zone: " + nyNow.getZone());
		
		//another way to build ZonedDateTime
		ZonedDateTime time1 = ZonedDateTime.of(tpNow, newYork);
		System.out.println("Time-1: " + time1);
		
		//another way to build ZonedDateTime
		ZonedDateTime time2 = time1.plusDays(1).minusMinutes(15);
		System.out.println("Time-2: " + time2);

	}

}
