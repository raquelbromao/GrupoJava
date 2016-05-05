package entidades;

//import java.util.Collection;

public class Disciplina {
	private final int codigo;
	private String nome;
	private int cargaHoraria;
	private Aluno aluno;
	private Professor professor;
	//private Collection<Matricula> matricula;
	
    public Disciplina(int codigo, String nome, int cargaHoraria, Aluno aluno,
			Professor professor) {
		//super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.aluno = aluno;
		this.professor = professor;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Disciplina [Codigo:" + codigo + ", Nome:" + nome + ", Carga Horaria:" + cargaHoraria + ", Aluno:" + aluno
				+ ", Professor" + professor + "]";
	}	
}
