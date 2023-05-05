package org.lessons.java;

import java.util.Scanner;

public class JavaSnack11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scegli il numero da controllare");
		
		int numUser = sc.nextInt();
		
		System.out.println("La lista dei numeri per cui è divisibile " + numUser + " è la seguente:");
		
		for ( int i = 1; i <= numUser; i++ ) {
			
			if ( numUser % i == 0) {
				
				System.out.println(i);
			}
		}	
		
		sc.close();		
	}
}
