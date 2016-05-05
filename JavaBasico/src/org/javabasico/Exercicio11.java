package org.javabasico;

import java.util.Scanner;
import java.lang.String;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in); //buffer de entrada de string
		
		System.out.println("Digite a frase:");
		
		String frase = buffer.nextLine(); //comndo de ler a string do usuario
		
		System.out.println("Frase: "+frase);
		
		int total = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == 'a') { //funcao para identicar um determinado char numa string
				total = total +1;
			}			
		}
		
		System.out.println("Quantidade de a's: "+total);
		
		buffer.close();

	}

}
