package typedates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TypeDates {
	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date2);
		
		Instant date3 = Instant.now();
		System.out.println(date3);
	
		LocalDate date4 = LocalDate.parse("2022-11-20");
		System.out.println(date4);
		
		LocalDateTime date5 = LocalDateTime.parse("2022-11-20T01:30:26");
		System.out.println(date5);
		
		Instant date6 = Instant.parse("2022-11-20T01:30:26Z");
		System.out.println(date6);
		
		Instant date7 = Instant.parse("2022-11-20T01:30:26-03:00");
		System.out.println(date7);
		
		LocalDate date8 = LocalDate.parse("20/12/2022", dateTimeFormatter1);
		System.out.println(date8);
		
		LocalDateTime date9 = LocalDateTime.parse("20/11/2022 01:30", dateTimeFormatter2);
		System.out.println(date9);
		
		LocalDate date10 = LocalDate.of(2022, Month.NOVEMBER, 20);
		System.out.println(date10);
		
		LocalDateTime date11 = LocalDateTime.of(2022, 11, 20, 14, 54);
		System.out.println(date11);
		
		System.out.println(dateTimeFormatter1.format(date11));
		
		System.out.println(dateTimeFormatter2.format(date5));

		System.out.println(dateTimeFormatter3.format(date6));
		
		LocalDate localDate1 = LocalDate.ofInstant(date6, ZoneId.systemDefault());
		System.out.println(localDate1);

		LocalDate localDate2 = LocalDate.ofInstant(date6, ZoneId.of("Portugal"));
		System.out.println(localDate2);
		
		System.out.println(date4.getDayOfMonth());
		
		LocalDate pastWeekLocalDate1 = date4.minusDays(7);
		System.out.println(pastWeekLocalDate1);
		
		LocalDate pastWeekLocalDate2 = date4.plusDays(7);
		System.out.println(pastWeekLocalDate2);
		
		Instant pastWeekInstant = date3.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		
//		Duration duration = Duration.between(pastWeekLocalDate1.atTime(0, 0), date4.atTime(0, 0));
		
		Duration duration = Duration.between(pastWeekLocalDate1.atStartOfDay(), date4.atStartOfDay());
		System.out.println(duration.toDays());
	}
}
