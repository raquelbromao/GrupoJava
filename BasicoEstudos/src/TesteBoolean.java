
public class TesteBoolean {
	
	public static void main(String[] args) {
		int idade = 17;		
		boolean amigoDoDono = true;
		
		if (idade < 18 && amigoDoDono == false) { // 'AND' = &&  'OR' = ||
			System.out.println("Nao pode entrar.");
		} else {
			System.out.println("Pode entrar.");
		}
	
		if (idade < 18 && !amigoDoDono) { // '!'+variavel � o mesmo que '== false'
			System.out.println("Nao pode entrar.");
		} else {
			System.out.println("Pode entrar.");
		}
	}

}
