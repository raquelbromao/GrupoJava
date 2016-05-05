package entidades;

public class Doutor extends Professor {
	private static double bonusSalarial = 1.3;
	private String tituloTese;

	public Doutor(long cpf, String nome, double salario, Disciplina disciplina,
			String tituloTese) {
		super(cpf, nome, salario, disciplina);
		this.tituloTese = tituloTese;
	}

	public String getTituloTese() {
		return tituloTese;
	}
	
	public void setTituloTese(String tituloTese) {
		this.tituloTese = tituloTese;
	}	
	
	public double getBonusSalarial() {
		return bonusSalarial;
	}
	
	public double getSalarioDoutor(){
		return (this.getSalario() * this.getBonusSalarial());
	}
	
	@Override
	public String toString() {
		return "Doutor [Titulo da Tese:" + tituloTese + "]";
	}
}
