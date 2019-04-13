package com.test.core_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program_2 {

	public static void main(String[] args) {
		test1();
		//test2();
		//test3();
	}
	
	public static void test1() {
		/**
		 * Arrays.asList returns old fashioned fixed size list which backed by
		 * a fixed size array whose size neither be extended nor be reduced.
		 * 
		 * so, list.remove method will throw "UnsupportedOperationExcecption".
		 * 
		 * We can use LinkedList and ArrayList to fix this issue.
		 */
		Integer a[] = { 1, 2, 3 };
		List<Integer> data = Arrays.asList(a);

		System.out.println(data);
		data.remove(2);

		System.out.println(data);
	}
	
	public static void test3() {
		List<Integer> data =new LinkedList<>();
		data.add(1);
		data.add(2);
		data.add(3);

		System.out.println(data);
		data.remove(2);

		System.out.println(data);
	}

	public static void test2() {
		List<Integer> data =new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);

		System.out.println(data);
		data.remove(2);

		System.out.println(data);
	}
	
	
}
