package br.com.controlesemaforo.Entidades;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Semaforo")
public class Semaforo {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name ="codigo", length = 6, columnDefinition = "varchar(6)")
	private String codigo;
	
	@Column(name ="Status", length = 10, columnDefinition = "varchar(10)")
	private String status;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL }, targetEntity = Localizacao.class, fetch = FetchType.EAGER, mappedBy = "semaforo")
	private Localizacao Localizacoes;
	
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Localizacao getLocalizacoes() {
		return Localizacoes;
	}
	public void setLocalizacoes(Localizacao localizacoes) {
		Localizacoes = localizacoes;
	}
	


	
	
	
	
}
