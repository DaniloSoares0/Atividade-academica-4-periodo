package br.com.controlesemaforo.MB;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;

import br.com.controlesemaforo.DAO.LocalizacaoDAO;
import br.com.controlesemaforo.DAO.SemaforoDAO;
import br.com.controlesemaforo.Entidades.Localizacao;
import br.com.controlesemaforo.Entidades.Semaforo;




@SuppressWarnings({ "deprecation", "unused" })
@ManagedBean
@ViewScoped
public class SemaforoMB {

	private List<Semaforo> listaSemaforo; 
	private Semaforo semaforo;
	private SemaforoDAO dao;
	
	private Localizacao localizacao;
	private LocalizacaoDAO daoloc;
	private List<Localizacao> listaLocalizacao;

	
	
	@PostConstruct
	public void init() {  //inicializacao
		
		semaforo = new Semaforo();
		dao = new SemaforoDAO();
		listaSemaforo = dao.recuperarTodos();
		
		localizacao = new Localizacao();
		daoloc = new LocalizacaoDAO();
		listaLocalizacao = daoloc.recuperarTodos();
		
	}

	
	public void gravar(ActionEvent actionEvent) {
	
		if(semaforo != null) {
			dao.incluir(semaforo);
			localizacao.setSemaforo(semaforo);
			
			
		}
		
		semaforo = new Semaforo();
		
		
		
		
		if(localizacao != null) {
			daoloc.incluir(localizacao);
		}
		
		
		localizacao = new Localizacao();
		
		
	    }

    
	public void excluir(ActionEvent actionEvent) {

		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		String parametro = req.getParameter("idSemaforo");
		Semaforo semaforo = dao.recuperar(Integer.parseInt(parametro));
		dao.excluir(semaforo);
		
		
	}
	
	
	
	
	
	//Getters e Setters
	
	
	public List<Semaforo> getListaSemaforo() {
		return listaSemaforo;
	}


	public void setListaSemaforo(List<Semaforo> listaSemaforo) {
		this.listaSemaforo = listaSemaforo;
	}


	public Semaforo getSemaforo() {
		return semaforo;
	}


	public void setSemaforo(Semaforo semaforo) {
		this.semaforo = semaforo;
	}


	public SemaforoDAO getDao() {
		return dao;
	}


	public void setDao(SemaforoDAO dao) {
		this.dao = dao;
	}


	public Localizacao getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}


	public LocalizacaoDAO getDaoloc() {
		return daoloc;
	}


	public void setDaoloc(LocalizacaoDAO daoloc) {
		this.daoloc = daoloc;
	}


	public List<Localizacao> getListaLocalizacao() {
		return listaLocalizacao;
	}


	public void setListaLocalizacao(List<Localizacao> listaLocalizacao) {
		this.listaLocalizacao = listaLocalizacao;
	}


	
}
	
	
	
	