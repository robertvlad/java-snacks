package org.lessons.java;

import java.util.Scanner;

public class JavaSnack10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Definisci la lunghezza del raggio");		
		double r = sc.nextInt();
		
		double a = r * r * 3.14,
				p = 2 * r * 3.14;
						
		System.out.println("La lunghezza del raggio è: " + r + ", la sua area è di: " + a + " ed il perimetro è: " + p);
		
		sc.close();		
	}
}
