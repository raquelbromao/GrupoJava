package entidades;

import java.util.ArrayList;

public class BD {
	private  ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private  ArrayList<Professor> professores = new ArrayList<Professor>();
	private  ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private  ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public BD(ArrayList<Aluno> alunos, ArrayList<Professor> professores, ArrayList<Disciplina> disciplinas, ArrayList<Matricula> matriculas) {
		//super();
		this.alunos = alunos;
		this.professores = professores;
		this.disciplinas = disciplinas;
		this.matriculas = matriculas;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}	
}
