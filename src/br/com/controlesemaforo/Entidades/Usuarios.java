package br.com.controlesemaforo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuarios {
	
	
	@Id
	@GeneratedValue
	private int CodUsuario;
	
	@Column(name ="NomeUsuario", length = 50, columnDefinition = "varchar(50)")
	private String NomeUsuario;
	
	@Column(name ="senhaUsuario", length = 50, columnDefinition = "varchar(50)")
	private String senhaUsuario;

	
	
	
	public int getCodUsuario() {
		return CodUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		CodUsuario = codUsuario;
	}

	public String getNomeUsuario() {
		return NomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	

	
	
}
