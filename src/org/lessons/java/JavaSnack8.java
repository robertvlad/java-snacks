package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class JavaSnack8 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int pariX = 0,
			disapriX = 0;
		
		Integer[] pari = new Integer[10],
				disapri = new Integer[10];
		
		for ( int i = 0; i < 10; i++) {
			
			int randNum = rand.nextInt(101);
			
			System.out.println(randNum);
			
			if (randNum % 2 == 0) {
				
				pari[pariX++] = randNum;
			}
			else {
				
				disapri[disapriX++] = randNum;
			}		
			
		}
		
		System.out.println(Arrays.asList(pari));
		System.out.println(Arrays.asList(disapri));
	}
}
