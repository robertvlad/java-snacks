package org.lessons.java;

import java.util.Scanner;

public class JavaSnack4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String parola = sc.nextLine();
		
		char[] lettere = parola.toCharArray();
		
		char ch;
		
		String parolaReverse = "";
		
		for ( int i = (lettere.length - 1); i >= 0; i--) {
			
			ch = lettere[i];
			
			parolaReverse = ch + parolaReverse;
		}
		
		System.out.println(parolaReverse);
		
		
		
		sc.close();
		
	}

}
