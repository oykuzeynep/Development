package lghlgh;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPI {

//	public void testLocalDateTime() {
//
//		LocalDateTime currentTime = LocalDateTime.now();
//		System.out.println("Şu anki Tarih: " + currentTime);
//
//		Month month = currentTime.getMonth();
//		int day = currentTime.getDayOfMonth();
//		int seconds = currentTime.getSecond();
//
//		System.out.println("Ay: " + month + " Gün: " + day + " Saat: " + seconds);
//
//		LocalDateTime timeExample = currentTime.withDayOfMonth(8).withYear(2016);
//		System.out.println("timeExample: " + timeExample);
//
//		LocalDate dateExample = LocalDate.of(2016, Month.AUGUST, 10);
//		System.out.println("dateExample: " + dateExample);
//
//		LocalTime anotherTimeExample = LocalTime.of(20, 45);
//		System.out.println("anotherTimeExample: " + anotherTimeExample);
//
//		LocalTime justAnotherTimeExample = LocalTime.parse("19:20:15");
//		System.out.println("justAnotherTimeExample: " + justAnotherTimeExample);
//	}

	public void testMethod() {
			Date currentDate = new Date();
			Instant now = currentDate.toInstant();
			ZoneId currentZone = ZoneId.systemDefault();
			LocalDateTime yerelZaman = LocalDateTime.ofInstant(now, currentZone);
			
			System.out.println("Yerel tarih: " + yerelZaman);
			
			ZonedDateTime bolgeselZaman = ZonedDateTime.ofInstant(now, currentZone);
			System.out.println("Bölgesel Zaman: " + bolgeselZaman);
		}

}
