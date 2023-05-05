package org.lessons.java;

import java.util.Scanner;

public class JavaSnack9 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defini l'altezza e la base");
		
		int h = sc.nextInt(),
			b = sc.nextInt();
		
		System.out.println("La base scelta è: " + b + " e l'altezza è: " + h);
		
		int a = b * h,
			p = (b + h) * 2;
		
		System.out.println("L'area del rettangolo è: " + a);
		System.out.println("Il perimetro del rettangolo è: " + p);
		
		sc.close();
	}
}
