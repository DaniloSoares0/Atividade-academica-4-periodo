package br.com.controlesemaforo.Entidades;

import java.util.List;
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
@Table(name = "Localizacao")
public class Localizacao {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name ="numero", length = 6, columnDefinition = "varchar(6)")
	private String numero;
	
	@Column(name ="rua", length = 50, columnDefinition = "varchar(50)")
	private String rua;
	
	@Column(name ="bairro", length = 50, columnDefinition = "varchar(50)")
	private String bairro;
	
	@Column(name ="Cidade", length = 50, columnDefinition = "varchar(50)")
	private String Cidade;
	
	@Column(name ="Estado", length = 50, columnDefinition = "varchar(50)")
	private String Estado;
	
	@Column(name ="CEP", length = 10, columnDefinition = "varchar(10)")
	private String CEP;
	
    @OneToOne
    @JoinColumn (name = "idSemaforo")
	private Semaforo semaforo;

	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	public Semaforo getSemaforo() {
		return semaforo;
	}
	public void setSemaforo(Semaforo semaforo) {
		this.semaforo = semaforo;
	}
	

	
}
