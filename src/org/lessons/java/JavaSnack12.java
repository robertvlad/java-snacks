package org.lessons.java;

import java.util.Arrays;

public class JavaSnack12 {
	
	public static void main(String[] args) {
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1lng = arr1.length;
		int arr2lng = arr2.length;
		
		Integer[] arr3 = new Integer[arr1lng + arr2lng];
		
		for ( int i = 0; i < arr1lng; i++) {
			
			arr3[i] = arr1[i];
		}
		
		for ( int i = 0; i < arr2lng; i++) {
			
			arr3[i + 5] = arr2[i];
		}
		
		System.out.println(Arrays.asList(arr3));		
	}
}
