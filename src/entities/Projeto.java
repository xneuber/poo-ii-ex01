package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	
	private String nome;
	private Date dt_inicio;
	private Date dt_termino;
	private List<Contratacao> listaContratacoes = new ArrayList<>();
	
	public Projeto(String nome, Date dt_inicio, Date dt_termino) {
		super();
		this.nome = nome;
		this.dt_inicio = dt_inicio;
		this.dt_termino = dt_termino;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDt_inicio() {
		return dt_inicio;
	}
	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	
	public Date getDt_termino() {
		return dt_termino;
	}
	public void setDt_termino(Date dt_termino) {
		this.dt_termino = dt_termino;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dt_inicio == null) ? 0 : dt_inicio.hashCode());
		result = prime * result + ((dt_termino == null) ? 0 : dt_termino.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (dt_inicio == null) {
			if (other.dt_inicio != null)
				return false;
		} else if (!dt_inicio.equals(other.dt_inicio))
			return false;
		if (dt_termino == null) {
			if (other.dt_termino != null)
				return false;
		} else if (!dt_termino.equals(other.dt_termino))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public boolean adicionarContratacao(Contratacao contratacao) {
		if(contratacao != null && !listaContratacoes.contains(contratacao)) {
			this.listaContratacoes.add(contratacao);
			return true;
		}
		return false;
	}
	public boolean removerContratacao(Contratacao contratacao) {		
		if ( contratacao != null && listaContratacoes.size() > 0 && listaContratacoes.contains(contratacao) ) {
			this.listaContratacoes.remove(contratacao);
			return true;
		}
		return false;
	}
	
	public void listarContratacoes() {
		System.out.println("***Contratacoes***");
		if (listaContratacoes.isEmpty()) {
			System.out.println("Não existem contratações!");
		}
		else {
			System.out.println("Projeto:\n\t"+ this.nome +"\nFuncionários:");
			for (Contratacao c : this.listaContratacoes ) {
				System.out.println("\t" + c.getFuncionario().getNome() + " [Status: " + c.getStatus() + "]");
			}
		}
	}
}
