package com.test.operator_statements;

public class Program_2 {

	public static void main(String[] args) {
		int x = 10;
		long y = 20;
		
		/**
		 * Here, Both of the operands are having different data type int and long.
		 * As y is long primtive type and it is broad than x's data type int.
		 * x will be promoted to long. And the result of the multiplication is also 
		 * expected  to be long.
		 * 
		 * So, below example will give compile time error.
		 */
		int z = x * y;
	}
}
