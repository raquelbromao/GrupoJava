package org.javabasico;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno:");
		int x = buffer.nextInt();
		
		if (x <= 90 && x>100) {
			System.out.println("A");
			
		} else if (x>=80 && x<=89 ) {
			System.out.println("B");
		} else if (x<=79 && x>=70) {
			System.out.println("C");
		} else {
			System.out.println("Reprovado");
		}
		
		buffer.close();

	}

}
