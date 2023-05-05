package org.lessons.java;

import java.util.Scanner;

public class JavaSnack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		int num = sc.nextInt();		
		
		System.out.println(num % 2 == 0 ? num : (num + 1));
		
		sc.close();
		
	}
}
