
public class TesteFor {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Ol�!");
		}
		
		
		for (int i = 0; i < 100; i++) {
			 if (i % 19 == 0) {
			    System.out.println("Achei um n�mero divis�vel por 19 entre x e y = " + i);
			    //break;
			 }
		}
		
		for (int i = 0; i < 100; i++) { //pula o intervelo de 51 a 59
			if (i > 50 && i < 60) {
			    continue;
			}
			System.out.println(i);
		}
		
	}
}
