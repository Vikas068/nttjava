package com.nttdata;
import static java.time.LocalDateTime.*;
import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {
	public static void main(String[] args) {
		
		LocalDateTime meeting,flight,statrt,end;
		
		//meeting=LocalDateTime.o
		//System.out.println(meeting);
		
		LocalDate flightDate=LocalDate.of(2014, MARCH, 5);
		LocalTime flighTime=LocalTime.of(21, 45);
//		flight=LocalDateTime.of(flightDate,flighTime);
	//
		System.out.println("flight leaves on :"+flightDate+"and at"+flighTime);
	}

}
