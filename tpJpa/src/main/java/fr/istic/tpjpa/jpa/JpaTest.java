package fr.istic.tpjpa.jpa;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		// TODO create entity

		Person p1 = new Person("thiam", "cheikh", "M", "cheikh@gmail.com", 0603,
				"elkheucha");
		Person p2 = new Person("xxxx", "xxxx", "M", "cheikh@gmail.com", 0603,
				"elkheucha");

		Home h1 = new Home("rennes", 1200, 192);
		Home h2 = new Home("redon", 1200, 192);
		Home h3 = new Home("lemans", 1200, 192);

		p1.setHomes(new ArrayList<Home>(Arrays.asList(h1)));
		p2.setHomes(new ArrayList<Home>(Arrays.asList(h2, h3)));

		h1.setPerson(p1);
		h2.setPerson(p2);
		h3.setPerson(p2);

		manager.persist(p1);
		manager.persist(p2);
		
		manager.persist(h1);
		manager.persist(h2);
		manager.persist(h3);

		

		// TODO persist entity

		tx.commit();

		// TODO run request

		System.out.println(".. done");

		manager.close();
	}

}
