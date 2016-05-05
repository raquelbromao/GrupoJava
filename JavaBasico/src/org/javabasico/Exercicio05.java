package org.javabasico;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Digite o raio:");
		
		float r = buffer.nextFloat();
		
		double perimetro = 2 * 3.14 * r;
		
		double area = 3.14 * Math.pow(r, 2);
		
		System.out.println("Perimetro:"+perimetro+" Area:"+area);

		buffer.close();
	}

}
