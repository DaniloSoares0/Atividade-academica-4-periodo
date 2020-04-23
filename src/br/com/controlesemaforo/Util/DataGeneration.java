package br.com.controlesemaforo.Util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.controlesemaforo.Entidades.Localizacao;
import br.com.controlesemaforo.Entidades.Semaforo;
import br.com.controlesemaforo.Entidades.Usuarios;

public class DataGeneration {
	
	public static void main(String[] args) {

		AnnotationConfiguration an = new AnnotationConfiguration();
		an.addAnnotatedClass(Localizacao.class);
		an.addAnnotatedClass(Semaforo.class);
		//an.addAnnotatedClass(Usuarios.class);
	
		an.configure();

		new SchemaExport(an).create(true, true);

	}
}