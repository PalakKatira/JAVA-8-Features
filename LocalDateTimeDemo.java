package com.palak.java8_features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dt1=LocalDateTime.of(1997,Month.MAY,25,12 ,12);
		System.out.println(dt1);
		
		System.out.println(dt1.plusMonths(5));
		System.out.println(dt1.minusDays(2));
		
		LocalDate birthday=LocalDate.of(1997,7,24);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday, today);
		
		System.out.printf("Age is %d Years %d Months %d days",p.getYears(),p.getMonths(),p.getDays());
	}
}
