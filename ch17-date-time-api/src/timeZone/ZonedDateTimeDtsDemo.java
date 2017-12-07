package timeZone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDtsDemo {

	public static void main(String[] args) {
		
		ZoneId usEast = ZoneId.of("America/New_York");
		LocalDateTime beforeStartDTS = LocalDateTime.of(2016, 03, 12, 16, 00);
		
		//DST begins: 2016/03/13
		ZonedDateTime timeS1 = ZonedDateTime.of(beforeStartDTS, usEast);
		System.out.println("TimeS-1: " + timeS1);
		
		ZonedDateTime timeS2 = timeS1.plusDays(1);
		System.out.println("TimeS-2: " + timeS2);
		
		ZonedDateTime timeS3 = timeS1.plusHours(3);
		System.out.println("TimeS-3: " + timeS3);
		
		//DST ends: 2016/11/06
		LocalDateTime beforeEndDTS = LocalDateTime.of(2016, 11, 05, 16, 00);
		ZonedDateTime timeE1 = ZonedDateTime.of(beforeEndDTS, usEast);
		System.out.println("timeE-1: " + timeE1);
		
		ZonedDateTime timeE2 = timeE1.plusDays(1);
		System.out.println("timeE-2: " + timeE2);
		
		ZonedDateTime timeE3 = timeE1.plusHours(24);
		System.out.println("timeE-3: " + timeE3);

	}

}
