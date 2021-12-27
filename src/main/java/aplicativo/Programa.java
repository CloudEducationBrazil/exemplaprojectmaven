package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// Versão Java 8 e 11 são LTS
		//Pessoa p1 = new Pessoa(1, "Heleno", "heleno@gmai.com");
		//Pessoa p2 = new Pessoa(2, "Julia", "julia@gmai.com");
		//Pessoa p3 = new Pessoa(3, "Josy", "josy@gmai.com");
		
/*		Pessoa p1 = new Pessoa(null, "Heleno", "heleno@gmail.com");
		Pessoa p2 = new Pessoa(null, "Julia", "julia@gmail.com");
		Pessoa p3 = new Pessoa(null, "Josy", "josy@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); // Contexto de persistência
		
		// Incluir no BD
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

		System.out.println("Pronto!!!");
		
		em.close();
		emf.close();
*/		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); // Contexto de persistência

		// Consultar no BD - entidade monitorada (através do select e logo em seguida, após uma inserção
		Pessoa p4 = em.find(Pessoa.class, 1);
		System.out.println(p4);
		System.out.println("Pronto!!!");
		
		em.close();
		emf.close();
		
	
		//System.out.println();
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
	}

}
