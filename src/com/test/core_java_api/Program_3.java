package com.test.core_java_api;

import java.util.ArrayList;
import java.util.List;

public class Program_3 {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("a");
		data.add(0, "b");
		
		/**
		 * We can not skip index sequence while inserting elements  to a list
		 * Here, we have inserted element to 0th and 1th position.
		 * Now , below line will throw "ArrayIndexOutOfBoundExcecption" while trying to 
		 * add new value to 3rd index. And Index 2nd is not used yet.
		 */
		data.add(3, "b");
		
		System.out.println(data);
	}
}
