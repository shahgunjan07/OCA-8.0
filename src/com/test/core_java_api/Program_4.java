package com.test.core_java_api;

import java.util.ArrayList;
import java.util.List;

public class Program_4<E> {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		
		System.out.println(data);
		/**
		 * While passing wrapper type, JVM will call
		 * overloaded method remove(Object object) on ArrayList class
		 */
		data.remove(new Integer(3));
		System.out.println(data);
		/**
		 * While passing primitive type, JVM will call
		 * overloaded method remove(int index) on ArrayList class.
		 * But as ArrayList has only two elements, it will throw ArrayIndexOutOfBoundException.
		 */
		data.remove(2);
		System.out.println(data);
	}
	
	
}
