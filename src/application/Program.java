package application;

import entities.Projeto;
import entities.Funcionario;
import entities.Contratacao;
import entities.Turma;

public class Program {

	public static void main(String[] args) {
		
		Projeto a1 = new Projeto("1", "Caroline");
		Projeto a2 = new Projeto("2", "Isabelle");
		
		Turma t1 = new Turma(1, "2021.A"); 
		Turma t2 = new Turma(2, "2021.B");
		
		Funcionario d1 = new Funcionario("POO", 72);
		Funcionario d2 = new Funcionario("BD", 54);
		
		Contratacao m1 = new Contratacao(a1, t1, d1);
		Contratacao m2 = new Contratacao(a1, t1, d2);
		Contratacao m3 = new Contratacao(a2, t2, d1);
		
		//Aluno 1
		a1.listarMatriculas();			
		m1.confirmar();
		a1.listarMatriculas();
		m1.trancar();
		m2.confirmar();
		a1.listarMatriculas();
		
		//Aluno 2
		a2.listarMatriculas();
		m3.confirmar();
		a2.listarMatriculas();
		m3.reprovar();
		a2.listarMatriculas();
	}

}