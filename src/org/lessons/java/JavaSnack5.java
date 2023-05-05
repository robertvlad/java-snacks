package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class JavaSnack5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Scegli un numero");
		
		int numeroUser = sc.nextInt();
		
		int somma = 0,
			sommaPari = 0,
					x = 0;
		double media = 0,
				mediaDispari = 0;
		
		for ( int i = 1; i <= numeroUser; i++) {
			
			int randNum = rand.nextInt(101);
			
			System.out.println(randNum);
			
			// sommatoria di tutti i valori;			
			
			somma = randNum + somma;
			
			// sommatoria dei valori pari;
			
			
			if ( randNum % 2 == 0) {
				
				sommaPari = randNum + sommaPari;
			}
			
			// media di tutti i valori;
			
			double sommaD = somma,
					numeroUserD = numeroUser;
			
			media = sommaD / numeroUserD;
			
			// media dei valori dispari;
			
			
			if (randNum % 2 != 0) {				
				x++;
			}
			
			double sommaDisapri = somma - sommaPari;
			
			mediaDispari = sommaDisapri / numeroUserD;
			
			// minimo di tutti i valori;
			
			// massimo di tutti i valori;
		
			
			
		}
		
		System.out.println("ciao" + x);
		
		System.out.println("La somma dei numeri è: " + somma);
		System.out.println("La somma dei numeri pari è: " + sommaPari);
		System.out.println("La media dei numeri è: " + media);
		System.out.println("La media dei numeri disapri è: " + mediaDispari);
		System.out.println("Il minimo di tutti i valori è: " + somma);
		System.out.println("Il massimo di tutti i valori è: " + somma);
		
		sc.close();
	}
}
