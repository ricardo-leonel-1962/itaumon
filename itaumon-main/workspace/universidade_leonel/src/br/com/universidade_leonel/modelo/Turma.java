package br.com.universidade_leonel.modelo;

public class Turma {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	*/
	private String nome;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	
	public String setAll() {
		return
				"Nome:" + nome + "\n" +
				"Periodo:" + periodo + "\n" +
				"Curso:" + curso.getAll() + "\n" +
				"Aluno:" + aluno.getAll() + "\n" +
				"Professor: \n" + professor.getAll();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
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
	
}

