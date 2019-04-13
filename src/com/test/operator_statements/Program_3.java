package com.test.operator_statements;

public class Program_3 {

	public static void main(String[] args) {
		byte i = 127;
		int j = 2;
		
		/**
		 * Here, data type of i is not broad enough to hold 
		 * output of (127*2). But compound operator *= will automatically
		 * cast the resulting value to data type of the value on the left hand side
		 * of the compound operator.
		 */
		i *= j;
		
		System.out.println(i);
	}
}
