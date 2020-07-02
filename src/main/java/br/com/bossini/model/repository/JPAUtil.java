package br.com.bossini.model.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	//QUANDO O CLASS LOADER PEGAR ESSA CLASSE - EXECUTA O STATIC
	
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("bossiniPU");
	}
	
	public static EntityManager getEntityManager () {
		return factory.createEntityManager();
	}
	
	public static void close() {
		factory.close();
	}

}
