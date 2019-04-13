package com.test.core_java_api;

public class Program_1 {
	public static void main(String[] args) {
		String a = "main";
		String b = "main";
		String c = "  main".trim();
		
		System.out.println(a==b);
		
		/**
		 * Even though the value of b and c are similar, but value of c is computed at
		 * run time.
		 * Since, value of c is not computed at compile time. JVM will create a new String
		 * object to hold value of c.
		 * 
		 * So, a==c or b==c will result to false.
		 */
		System.out.println(b==c);
	}
}
