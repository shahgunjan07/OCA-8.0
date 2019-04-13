package com.test.core_java_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Example to convert Collection to Array.
 * Here, with different test cases have confirmed that any change or modification
 * to collection will not get reflected in an array which is created from the same list.
 *
 * The original list and converted array are not related to each other. So derived list
 * is not backed copy of original list
 */
public class Program_5 {
	static List<String> data;
	static {
		data = new ArrayList<>();
		data.add("T1");
		data.add("T2");
		data.add("T3");
		data.add("T4");
	}

	public static void test1() {
		String[] dataArr = data.toArray(new String[4]);

		System.out.print("List : ");
		for (String str : data) {
			System.out.print(" " + str);
		}
		System.out.println();

		System.out.print("Array : ");
		for (String str : dataArr) {
			System.out.print(" " + str);
		}
		System.out.println();
	}
	
	public static void test2() {
		String[] dataArr = data.toArray(new String[4]);

		/** update of value directly in array list **/
		data.set(3, "T5");

		System.out.print("List : ");
		for (String str : data) {
			System.out.print(" " + str);
		}
		System.out.println();

		System.out.print("Array : ");
		for (String str : dataArr) {
			System.out.print(" " + str);
		}
		System.out.println();

	}
	
	public static void test3() {
		String[] dataArr = data.toArray(new String[4]);

		/** remove one of value directly in array list **/
		data.remove("T1");

		System.out.print("List : ");
		for (String str : data) {
			System.out.print(" " + str);
		}
		System.out.println();

		System.out.print("Array : ");
		for (String str : dataArr) {
			System.out.print(" " + str);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
}
