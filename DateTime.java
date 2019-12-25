package com.palak.java8_features;

import java.time.LocalDate;//DateTime is present in java.time package
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[] args) {

		//LocalDate used to represent date values
		LocalDate date = LocalDate.now();
		
		//prints date in the default format
		System.out.println("The current date is: "+date);
		
		//User defined format
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		System.out.print("The user defined date format: ");
		
		//make sure it is printf
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		
		//LocalTime used to represent Time values
		LocalTime time=LocalTime.now();
		//prints time in the default format
		System.out.println('\n');
		System.out.println("The current time is: "+time);
		
		
		//LocalDateTime used to represent both date as well as time
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		int dd1=dt.getDayOfMonth();
		int mm1=dt.getMonthValue();
		int yyy=dt.getYear();
		
		System.out.printf("Date:%d-%d-%d",dd,mm,yyy);
		
		int h=dt.getHour();
		int m=dt.getMinute();
		int s=dt.getSecond();
		int n=dt.getNano();
		
		System.out.printf("\nTime:%d:%d:%d:%d",h,m,s,n);
	}
}
