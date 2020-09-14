package com.nttdata;

import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import java.util.*;
import static java.lang.System.out;

public class LocalDateExample {
	
	public static void main(String[] args) {
		
		
		LocalDate now,bDate, nowPlusMonth,nextTues;
		
		now=LocalDate.now();
		System.out.println("Today's Date is: "+now);
		
		bDate=LocalDate.of(1996, 7, 18);
		System.out.println("My birth date is: "+bDate);
		System.out.println("Is my birthday before month :"+bDate.isBefore(now));
		System.out.println("Is my birth is leap year??  :"+bDate.isLeapYear());
		System.out.println("My birthday day of week is: "+bDate.getDayOfWeek());
		
		//System.out.println("The date of month from now :"+ nowPlusMonth);
		nowPlusMonth=now.plusMonths(1);
		System.out.println("The now plusmonth is: "+nowPlusMonth);
		
		
		
	}
	
	

}
