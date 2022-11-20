package typedates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TypeDates {
	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

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
	}
}
