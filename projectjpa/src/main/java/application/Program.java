package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project-jpa");
		EntityManager em = emf.createEntityManager();

		Person p = em.find(Person.class, 2);

		System.out.println(p);
		
		em.close();
		emf.close();
	}

}
