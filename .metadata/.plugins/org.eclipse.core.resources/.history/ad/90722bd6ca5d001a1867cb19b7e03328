package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p1 = new Person(null, "Vitor", "vitor@gmail.com");
		Person p2 = new Person(null, "Thales", "thales@gmail.com");
		Person p3 = new Person(null, "fabiano", "fabiano@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
	}

}
