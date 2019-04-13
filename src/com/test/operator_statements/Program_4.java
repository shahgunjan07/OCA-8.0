package com.test.operator_statements;

public class Program_4 {

	public static void main(String[] args) {

	}

	public void test1(final String ch) {
		
		/**
		 * The value of a "case" statement must be final constant.
		 * Even though the value of "ch" is String constant but 
		 * it is not compile time constant, so it will give compile time
		 * error while using in case statement.
		 */
		String a = "t";
		final String b = "t";
		
		switch ("c") {
			case ch:
				break;
			case a:
				break;
			case b:
				break;
			default:
				break;
		}
	}

	public void test2() {
		String ch = "";
	}
}
