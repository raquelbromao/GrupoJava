package entidades;

import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in); //para ler entradas do usuário
		float op = buffer.nextInt();
		
		System.out.println("|||||||||||||||| MENU |||||||||||||||||||");
		System.out.println("||1. Cadastro de Professor             ||");
		System.out.println("||2. Cadastro de Aluno                 ||");
		System.out.println("||3. Cadastro de Disciplina            ||");
		/*while (op ) {
			
		}		*/
		
		buffer.close(); //fecha a possibilidade de ler as entradas do usuário
		
	}
}
