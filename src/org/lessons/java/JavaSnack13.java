package org.lessons.java;

import java.util.Arrays;

public class JavaSnack13 {
	
	public static void main(String[] args) {
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int n1 = arr1[0];
		int n2 = arr2[0];
		
		arr1[0] = n2;
		arr2[0] = n1;
		
		System.out.println(Arrays.asList(arr1));
		System.out.println(Arrays.asList(arr2));
	}
}
