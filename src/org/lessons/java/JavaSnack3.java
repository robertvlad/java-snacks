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
		
		for ( int i = 1; i < numeri.length; i+=2) {
			
			int numero = numeri[i];
				
			somma += numero;
		}
		
		System.out.println(somma);
	
	}
}
