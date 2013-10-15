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

		Person p1 = new Person("thiam", "cheikh", "M", "cheikh@gmail.com", 0603,"elkheucha");
		Person p2 = new Person("diop", "modou", "M", "modou@gmail.com", 0305,"modou");
		Person p3 = new Person("sow", "fatou", "S", "fatou@gmail.com", 0407,"fatou");
		Person p4 = new Person("thiam", "sokhna", "S", "sokhna@gmail.com", 2511,"sokhna");

		Home h1 = new Home("rennes", 1200, 192);
		Home h2 = new Home("redon", 1700, 198);
		Home h3 = new Home("lemans", 1900, 128);
		Home h4 = new Home("limoges", 2100, 200);
		Home h5 = new Home("lyon", 3900, 228);
		Home h6 = new Home("brest", 1400, 115);
		Home h7 = new Home("paris", 4900, 158);
		Home h8 = new Home("nice", 1900, 138);
		Home h9 = new Home("creteil", 1220, 25);
		Home h10 = new Home("nantes", 1960, 12);
		
		
		p1.setHomes(new ArrayList<Home>(Arrays.asList(h1)));
		p2.setHomes(new ArrayList<Home>(Arrays.asList(h2, h3)));
		p3.setHomes(new ArrayList<Home>(Arrays.asList(h4,h5)));
		p4.setHomes(new ArrayList<Home>(Arrays.asList(h6,h7)));
		
		h1.setPerson(p1);
		h2.setPerson(p2);
		h3.setPerson(p2);
		h4.setPerson(p3);
		h5.setPerson(p3);
		h6.setPerson(p4);
		h7.setPerson(p4);

		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		manager.persist(p4);
		
		manager.persist(h1);
		manager.persist(h2);
		manager.persist(h3);
		manager.persist(h4);
		manager.persist(h5);
		manager.persist(h6);
		manager.persist(h7);

		// TODO persist entity

		tx.commit();

		// TODO run request

		System.out.println(".. done");

		manager.close();
	}

}
