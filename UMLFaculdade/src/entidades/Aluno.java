package entidades;

//import java.util.Collection;
import java.util.Date;

public class Aluno {
	private int matricula;
	private String nome;
	private Date dataNascimento;
	private Disciplina disciplina;
	//private Collection<Matricula> matricula;
	
	public Aluno(int matricula, String nome, Date dataNascimento, Disciplina disciplina) {
		//super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.disciplina = disciplina;
	}	

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}	
	
	@Override
	public String toString() {
		return "Aluno [Matricula:" + matricula + ", Nome:" + nome + ", Data de Nascimento:" + dataNascimento + ", Disciplina:"
				+ disciplina + "]";
	}	
}
