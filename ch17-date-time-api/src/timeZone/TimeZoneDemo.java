package timeZone;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class TimeZoneDemo {

	public static void main(String[] args) {
		
		//ZoneId
		ZoneId taipei = ZoneId.systemDefault();
		System.out.println("Zone ID: " + taipei.getId());
		
		ZoneId newYork = ZoneId.of("America/New_York");
		System.out.println("Zone ID: " + newYork.getId());
		
		//ZoneId >> ZoneRules
		ZoneRules taipeiRules = taipei.getRules();
		ZoneRules newYorkRules = newYork.getRules();
		
		//US started DST in 2016-03-13
		Instant beforeUsDST = Instant.parse("2016-03-12T00:00:00z");
		Instant inUsDST = Instant.parse("2016-03-14T00:00:00z");
		Instant now = Instant.now();
		
		System.out.println("Method Call\t\t" + "Taipei\t" + "NewYork(inDST)\t" + "NewYork(beforeDST)");
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("isDaylightSavings():\t" + taipeiRules.isDaylightSavings(now) + "\t\t" 
													+ newYorkRules.isDaylightSavings(inUsDST) + "\t\t" 
													+ newYorkRules.isDaylightSavings(beforeUsDST));
		
		System.out.println("getDaylightSavings():\t" + taipeiRules.getDaylightSavings(now).toHours() + "\t\t" 
													 + newYorkRules.getDaylightSavings(inUsDST).toHours() + "\t\t"
													 + newYorkRules.getDaylightSavings(beforeUsDST).toHours());
		
		ZoneOffset os = taipeiRules.getOffset(LocalDateTime.now());
		System.out.println("getOffset():\t\t" + os + "\t\t" 
											  + newYorkRules.getOffset(inUsDST) + "\t\t" 
											  + newYorkRules.getOffset(beforeUsDST));
		
		ZoneOffset sos = taipeiRules.getStandardOffset(now);
		System.out.println("getStandardOffset():\t" + sos + "\t\t" 
													+ newYorkRules.getStandardOffset(inUsDST) + "\t\t"
													+ newYorkRules.getStandardOffset(beforeUsDST));
		
	}

}
