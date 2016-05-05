package org.javabasico;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in); //buffer para toda variavel que armazenara entrada de usuario
		
		System.out.println("Digita lerdeza:");
		
		int x = buffer.nextInt(); //entrada do usuario
		
		int[] arranjo = new int[x];  //criacao do arranjo
		
		for (int j = 0; j < arranjo.length; j++) { //laço para entrada de cada posicao do arranjo dada pelo usuario
			arranjo[j] = buffer.nextInt();
			System.out.println("\nArranjo:"+arranjo[j]);
		}
		
		for (int i : arranjo) { //laco para imprimir as posicoes
			System.out.println(i);
		}
		
		buffer.close(); //necessario o fechamento do buffer
	}

}
