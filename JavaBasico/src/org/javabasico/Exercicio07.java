package org.javabasico;


public class Exercicio07 {

	public static void main(String[] args) {
		char c = 's';
		char x = 's';
		
		float d = 2.4f;
		float e = 3.1f;
		
		String s1 = "Amo o Lulu";
		String s2 = "Amo o Lulu";
		
		if (c == x) {
			System.out.println("Caracteres iguais");
		} else {
			System.out.println("Caracteres não são iguais");
		}
		
		if (d == e) {
			System.out.println("Flutuantes iguais");
		} else {
			System.out.println("Flutuantes não são iguais");
		}
		
		if (s1.equals(s2)) {
			System.out.println("Strings são iguais");
		} else {
			System.out.println("Strings não são iguais");
		}

	}

}
