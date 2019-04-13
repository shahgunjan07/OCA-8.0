package com.test.operator_statements;

public class Program_7 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		/**
		 * Default capacity of String Builder is 16.
		 * STringBuilder internally uses char[] to store the String characters
		 * And char array is initialized with default length 16.
		 */
		System.out.println(sb.capacity());
		
		sb.append("str");
		
		/**
		 * It returns length of String stored in StringBuilder
		 */
		System.out.println(sb.length());
	}
}
