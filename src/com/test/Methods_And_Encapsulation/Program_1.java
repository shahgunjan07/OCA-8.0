package com.test.Methods_And_Encapsulation;

public class Program_1 {

	public static int x = 100;

	public static void main(String a[]) {
		Program_1 object = new Program_1();
		object = null;

		/**
		 * Static method or variable can be accessed by class name and dot operator.
		 * Below statement is trying to access static member variable is instance of
		 * class. In this case, JVM will use type of instance (Program_1) to call static
		 * member variables.
		 * 
		 * So, It will not generate "NullPointerException"
		 */
		System.out.println(object.x);

	}
}
