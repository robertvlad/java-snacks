package org.lessons.java;

import java.util.Random;

public class JavaSnack2 {
	
	public static void main(String[] args) {
		
		String[] nomi = {
				"Luca",
				"Giovanni",
				"Luisa",
				"Sara"
		};	
		
		String[] cognomi = {
				"Rossi",
				"Verdi",
				"Caprina",
				"Grembo"
		};
		
		Random rand = new Random();
		
		for ( int i = 0; i < nomi.length; i++ ) {
			
			int randNomi = rand.nextInt(nomi.length);
			int randCognomi = rand.nextInt(nomi.length);
			
			System.out.println(nomi[randNomi] + " " + cognomi[randCognomi]);			
		}
	}
}
