package com.training.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ExampleOnDate {
 public static void main(String[] args) {
	
	 Date d = new Date();
	 System.out.println(d);
	 
	 //java8  joda.api org java.time  
	 LocalDate ld = LocalDate.now();
	 System.out.println("current date : "+ld);
	 System.out.println("Day is extracted from Date  : "+ld.getDayOfMonth());
	 System.out.println("Month is extracted from Date  : "+ld.getMonthValue());
	 System.out.println("year is extracted from Date  : "+ld.getYear());
	 
	 //java8 joda.api org ->java.time
	 
	LocalTime lt= LocalTime.now();
	 System.out.println("Current Time is : "+lt);
	 System.out.println("Hours from Time : "+lt.getHour());
	 System.out.println("Minutes from Time : "+lt.getMinute());
	 System.out.println("Seconds from Time : "+lt.getSecond());
	 System.out.println("MillSeconds from Time : "+lt.getNano());
	 
	 // //java8 joda.api org ->java.time using LocalDateTime
	  LocalDateTime ldt =LocalDateTime.now();
	  System.out.println("Current Date and Time: "+ldt);
	  System.out.println(ldt.getDayOfMonth()+" "+ldt.getMonth()+" "+ldt.getYear());
	  System.out.println("HH:MM:SS");
	  System.out.println(ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
	  
	 
	 
	 
	 
}
}
