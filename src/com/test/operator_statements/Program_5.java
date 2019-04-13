package com.test.operator_statements;

public class Program_5 {

	public static void main(String[] args) {
		
		/**
		 * Switch will execute all case statements until 
		 * it find a break; statement to terminate the flow.
		 */
		switch ("a") {
			case "a":
				System.out.println("a");
			case "b":
				System.out.println("b");
				break;
			case "c":
				System.out.println("c");
				break;
			case "d":
				System.out.println("d");
				break;
			default:
				System.out.println("Default");
				break;
		}
	}
}
