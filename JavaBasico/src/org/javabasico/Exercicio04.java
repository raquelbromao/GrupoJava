package org.javabasico;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Digite x:");
		
		float x = buffer.nextFloat();
		
		System.out.println("Digite y:");
		
		float y = buffer.nextFloat();
		
		double conta = Math.pow(x, 120) / Math.sqrt(y);
		
		System.out.println("Resultado:"+conta);
		
		buffer.close();
		
	}

}
