package com.test.core_java_api;

import java.time.LocalDate;
import java.time.Period;

public class Program_7 {

	public static void test1() {
		System.out.println("-------------------------------------");
		/** Create a period of 1 year and 1 day **/
		Period period = Period
							.ofYears(1)
							.ofDays(1);

		/**
		 * Above statement look like chaining of Period to create 
		 * a period of 1 year and 1 day.
		 * 
		 * But will not work in chaining manner as ofYears and ofDays are static methods
		 * and period is immutable class, above statement will only create 
		 * a period for 1 day.
		 * 
		 * It is recommended to use Period.of method for creating periods of 
		 * multiple parameters
		 */
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plus(period);
		System.out.println(date);
	}
	
	public static void test2() {
		System.out.println("-------------------------------------");
		/** Create a period of 1 year and 1 day **/
		Period period = Period.of(1, 0, 1);

		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plus(period);
		System.out.println(date);
	}

	public static void main(String[] args) {
		test1();
		test2();
	}
}
