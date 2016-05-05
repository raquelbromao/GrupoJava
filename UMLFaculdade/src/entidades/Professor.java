package entidades;

public abstract class Professor {
	protected final long cpf;
	protected String nome;
	protected double salario;
	protected Disciplina disciplina;

	public Professor(long cpf, String nome, double salario,	Disciplina disciplina) {
		//super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public long getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Professor [CPF:" + cpf + ", Nome:" + nome + ", Salario:" + salario + ", Disciplina" + disciplina + "]";
	}
}
