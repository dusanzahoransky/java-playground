package sk.dzahoransky.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {
	public static void main(String[] args) {
		
		LocalDate latinTripStart = LocalDate.of(2014, Month.DECEMBER, 5);
		LocalDate latinTripEnd = LocalDate.of(2015, Month.MAY, 20);
		
		System.out.println("Days of trip " + ChronoUnit.DAYS.between(latinTripStart, latinTripEnd.plusDays(1L)));
	}

}
