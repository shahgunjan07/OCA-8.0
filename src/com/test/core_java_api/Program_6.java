package com.test.core_java_api;

import java.util.Arrays;
import java.util.List;

/**
 * While creating list from an Array, The newly created list and array remains linked
 * to each other. So newly generated list works as backed copy of input list.
 * 
 * Any change in array value will be automatically reflected in value of List.
 * @author shahg
 *
 */
public class Program_6 {

	static String[] data;
	static {
		data = new String[5];
		data[0] = "T1";
		data[1] = "T2";
		data[2] = "T3";
		data[3] = "T4";
	}
	
	public static void test1() {
		List<String> list = Arrays.asList(data);
		
		System.out.println();
		for (String str : list) {
			System.out.print(" "+str);
		}
		System.out.println();
	}
	
	public static void test2() {
		List<String> list = Arrays.asList(data);
		
		data[4] = "T5";
		System.out.println();
		for (String str : list) {
			System.out.print(" "+str);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test1();
		test2();
	}
}
