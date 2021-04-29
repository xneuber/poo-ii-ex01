package entities;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {

	private Date data;
	private Cargo cargo;
	private Status status;
	private Projeto projeto;
	private Funcionario funcionario;
	

	public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.data = data;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.projeto = projeto;
		this.funcionario = funcionario;
		projeto.adicionarContratacao(this);
		
	}

	public Date getData() {
		return this.data;
	}

	public Projeto getProjeto() {
		return this.projeto;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public Cargo getCargo() {
		return this.cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		if (this.status == Status.PENDENTE){
			this.status = Status.CONTRATADO;
		}
	}
	
	public void demitir() {
		if (this.status == Status.CONTRATADO)	{
			this.status = Status.DEMITIDO;
		}
	}

	@Override
	public String toString() {
		return	"\t" + this.funcionario + "[Status: " + this.status + "]";
				
	}
	
	
}