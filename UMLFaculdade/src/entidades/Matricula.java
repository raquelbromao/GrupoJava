package entidades;

public class Matricula {
	private final Integer pontuacao;
	private Aluno aluno;
	private Disciplina disciplina;	

	public Matricula(Integer pontuacao, Aluno aluno, Disciplina disciplina) {
		if (pontuacao >= 0 || pontuacao <=100) {
			this.pontuacao = pontuacao;
		} else {
			System.out.println("Nota nao aceita, fora do intervalo 0-100.");
			this.pontuacao = null;
		}
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	@Override
	public String toString() {
		return "Matricula [Nota:" + pontuacao + ", Aluno:" + aluno + ", Disciplina:" + disciplina + "]";
	}	
}