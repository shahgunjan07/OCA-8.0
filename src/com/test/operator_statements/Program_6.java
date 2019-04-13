package com.test.operator_statements;

public class Program_6 {

	public static void main(String[] args) {
		LABEL1: for (int i = 0; i < 5; i++) {

			
			if (i == 2) {
				break LABEL1;
			}
			System.out.println("Inside For1");
		}

		LABEL2: for (int i = 0; i < 5; i++) {

			
			if (i == 2) {
				continue LABEL2;
			}
			System.out.println("Inside For2");
		}
	}
}
