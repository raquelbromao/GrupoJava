package javarranjo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: (linhaxcolunas)");
		
		int x = buffer.nextInt();
		int y = buffer.nextInt();
		
		int[][] matriz1 = new int[x][y];
		
		for(int linha=0 ; linha < matriz1.length ; linha++){
            for(int coluna = 0; coluna < matriz1[0].length ; coluna ++){
                System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                matriz1[linha][coluna] = buffer.nextInt();
            }
        }
		
		System.out.println("Digite o tamanho da nova matriz: (linhaxcolunas)");
		
		int z = buffer.nextInt();
		int w = buffer.nextInt();
		
		int[][] matriz2 = new int[z][w];
		
		for(int linha=0 ; linha < matriz2.length ; linha++){
            for(int coluna = 0; coluna < matriz2[0].length ; coluna ++){
                System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                matriz2[linha][coluna] = buffer.nextInt();
            }
        }
	}
	
	private static void Multiplicacao() {	
		for (int linha = 0; linha < matriz2.length; linha++) {
			for (int coluna = 0; coluna < matriz2[0].length; coluna++) {

			}

		}

	
	}
}
