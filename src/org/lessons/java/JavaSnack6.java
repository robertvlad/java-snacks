package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class JavaSnack6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scelga il limite della somma con un numero intero positivo");
		
		int userNum  = sc.nextInt();
		
		System.out.println("Lei ha scelto come limite il numero: " + userNum);
		
		Random rand = new Random();
			
		int somma = 0,
				randNumOut = 0;
		
		while (somma <= userNum) {
			
			int randNum = rand.nextInt(101);
			
			randNumOut = randNum;
			
			System.out.println(randNum);
			
			somma += randNum;
		}
		
		somma -= randNumOut;
		
		System.out.println("La somma più vicina al limite è: " + somma);
		
		sc.close();
	}

}
