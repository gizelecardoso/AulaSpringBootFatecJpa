package br.com.bossini;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.model.beans.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteInsereUmUsuario {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Usuario u = new Usuario();
		u.setNome("Gizele");
		u.setEmail("gizele.ccardoso@gmail.com");
		u.setFone("983228785");
		manager.persist(u);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
	}

}
