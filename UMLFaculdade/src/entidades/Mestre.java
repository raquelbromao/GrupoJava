package entidades;

public class Mestre extends Professor {
	private String tituloDissertacao;

	public Mestre(long cpf, String nome, double salario, Disciplina disciplina, String tituloDissertacao) {
		super(cpf, nome, salario, disciplina);
		this.tituloDissertacao = tituloDissertacao;
	}

	public String getTituloDissertacao() {
		return tituloDissertacao;
	}

	public void setTituloDissertacao(String tituloDissertacao) {
		this.tituloDissertacao = tituloDissertacao;
	}

	@Override
	public String toString() {
		return "Mestre [Titulo da Dissertacao:" + tituloDissertacao + "]";
	}
}
