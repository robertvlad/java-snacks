package org.lessons.java;

public class JavaSnack3 {
	
	public static void main(String[] args) {
		
		int[] numeri = {
				1,
				22,
				33,
				45,
				64
		};
		
		int somma = 0; 
		
		for ( int i = 0; i < numeri.length; i++) {
			
			int numero = numeri[i];
			
			if (numero % 2 != 0) {
				
				somma += numero;
			}
		}
		
		System.out.println(somma);
	
	}
}
