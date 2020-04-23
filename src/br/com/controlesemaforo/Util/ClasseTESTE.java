package br.com.controlesemaforo.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import br.com.controlesemaforo.DAO.DaoImplementado;
import br.com.controlesemaforo.DAO.LocalizacaoDAO;
import br.com.controlesemaforo.DAO.SemaforoDAO;
import br.com.controlesemaforo.Entidades.Localizacao;
import br.com.controlesemaforo.Entidades.Semaforo;

public class ClasseTESTE {
	public static List<Semaforo> a; 
	public static Class Semaforo ;
	
	 DaoImplementado daos = new DaoImplementado(Semaforo);
	
	static List<String> as = new ArrayList();
	static List<Localizacao> aas = new ArrayList();
	static ClasseTESTE t = new ClasseTESTE();
	static SemaforoDAO sem = new SemaforoDAO();
	
	static LocalizacaoDAO loc = new LocalizacaoDAO();
	public static void main(String[] args) {
		
		
		 
		t.recuperaEndereco();
		  
		  
}
  
  

	public List<String> recuperarTodosd() {
		Session session = FabricadeConexoes.getSession();		
		as = session.createQuery("FROM Semaforo").list();
		session.close();
		
		as.toString();
		return as;
	}

	
	public List<Localizacao> recuperaEndereco() {
		Session session = FabricadeConexoes.getSession();		
		aas = session.createQuery("FROM Localizacao as a INNER JOIN  fetch Semaforo  "
			).list();
		session.close();
		return aas;
		
		
	}






	public static void IncluirSemaforo() {
		Semaforo semaforo = new Semaforo();
		SemaforoDAO semDAO = new SemaforoDAO();
		ClasseTESTE s = new ClasseTESTE();
		
		semaforo.setCodigo("QP473");
		semaforo.setStatus("Ativo");
		semDAO.incluir(semaforo); //preciso comiitar a inclusao para gerar a chave na outra tabela
		s.Incluirlocalizacao(semaforo);
		
	    }
	

	public static void Incluirlocalizacao(Semaforo semaforo) {
		
    
		Localizacao localizacao = new Localizacao();
		LocalizacaoDAO loc = new LocalizacaoDAO();
		
		
		localizacao.setBairro("Nova Esperanca");
		localizacao.setCEP("302955920");
		localizacao.setCidade("Belo Horizonte");
		localizacao.setNumero("10");
		localizacao.setRua("Rua Quinze");
		localizacao.setEstado("Minas Gerais");
		localizacao.setSemaforo(semaforo);
		loc.incluir(localizacao);
		
	    
	
	
	
	}
}
