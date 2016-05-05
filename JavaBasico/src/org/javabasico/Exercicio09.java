package org.javabasico;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int x = buffer.nextInt();
		
		int total = 0;
		
		for (int i = 0; i < x; i++) {
			
			total = i + total + 1;
			System.out.print((i+1)+" + ");
			
		}
		
		System.out.print("= "+total);
		
		buffer.close();

	}

}
