package org.javabasico;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int[] arranjo = new int[5]; 
		
		for (int j = 0; j < arranjo.length; j++) {
			arranjo[j] = j;
			System.out.println("\nArranjo:"+arranjo[j]);
		}
		
	}
}
