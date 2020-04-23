package br.com.controlesemaforo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.controlesemaforo.Entidades.Localizacao;
import br.com.controlesemaforo.Util.FabricadeConexoes;
import br.com.controlesemaforo.Util.ServiceLocatorUtil;


public class LocalizacaoDAO extends DaoImplementado<Localizacao> {

	public LocalizacaoDAO() {
		super(Localizacao.class);
	}



/*	public static List<Localizacao> listar() {
		Session s;
		try {
			s = ServiceLocatorUtil.getInstance().getHibernateSession();
			List<Localizacao> lista = s.createQuery(
			        " FROM Localizacao ").list();
			s.close();
			
			return lista;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Localizacao recuperaLocalizacao(int locsem) {
		Session session = FabricadeConexoes.getSession();
		Query query = session
		        .createQuery("FROM Localizacao a WHERE a.locsem = :locsem");
		
		query.setParameter("locsem", locsem);
		Localizacao meta = (Localizacao) query.setMaxResults(1).uniqueResult();
		session.close();
		try {
			return meta;
		} catch (Exception e) {
			return null;
		}
		
	}
	*/
	
}
