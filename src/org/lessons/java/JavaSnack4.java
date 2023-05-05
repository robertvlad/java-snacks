package org.lessons.java;

import java.util.Scanner;

public class JavaSnack4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String parola = sc.nextLine();
		
		Boolean flag = false; 
		
		for ( int i = 0; i < parola.length() / 2; i++) {
			
			int x = parola.length() - i - 1;
			
			if ( parola.charAt(i) != (parola.charAt(x)) ) {
				
				flag = true;			
			}
		}
		
		if (flag) {
			
			System.out.println("Non palindroma");
		}
		else {
			System.out.println("Palindroma");
		}
		
		
		sc.close();
		
	}

}
