package org.lessons.java;

import java.util.Random;

public class JavaSnack7 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = 0;
		do {
			num = rand.nextInt(101);
			
			System.out.println(num);			
			
		} while ((num % 3 != 0) || (num % 5 != 0));
	}
}
