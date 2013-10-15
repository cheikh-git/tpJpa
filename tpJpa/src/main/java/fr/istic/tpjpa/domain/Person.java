package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
	private Long id;

	private String name;
	private String firstname;
	private String genre;
	private String mail;
	private List<Home> homes = new ArrayList<Home>();

	private double datenaissance;
	private String profile_facebook;

	public Person() {

	}

	public Person(String name, String firstname, String genre, String mail,
			double datenaissance, String profile_facebook) {
		this.name = name;
		this.firstname = firstname;
		this.genre = genre;
		this.mail = mail;
		this.datenaissance = datenaissance;
		this.profile_facebook = profile_facebook;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getProfile_facebook() {
		return profile_facebook;
	}

	public void setProfile_facebook(String profile_facebook) {
		this.profile_facebook = profile_facebook;
	}

	@OneToMany
	public List<Home> getHomes() {
		return homes;
	}

	public void setHomes( List<Home> homes) {
		this.homes = homes;
	}

	@Override
	public String toString() {
		return "Person[id=" + id + ",name=" + name + ",firstname=" + firstname
				+ ",genre=" + genre + ",date naissane=" + datenaissance
				+ ",mail=" + mail + ",profil facebook=" + profile_facebook
				+ "]";
	}

}
