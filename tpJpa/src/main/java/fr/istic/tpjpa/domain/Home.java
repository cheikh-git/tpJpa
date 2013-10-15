package fr.istic.tpjpa.domain;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;


@Entity
public class Home {
	
	private Long id;
	
	private String adresse;
	private double superficie;
	private double adresse_ip;
	private Person person;
	
	//private List persons= (List) new Person();
	
	
	public Home(){
		
	}
	
	public Home(String adresse,double superficie,double adresse_ip){
		this.adresse=adresse;
		this.superficie=superficie;
		this.adresse_ip=adresse_ip;
		
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public double getAdresse_ip() {
		return adresse_ip;
	}
	public void setAdresse_ip(double adresse_ip) {
		this.adresse_ip = adresse_ip;
	}
	@ManyToOne
	public Person getPerson(){
		return  person;
		
	}
	public void setPerson(Person person){
		this.person=person;
	}
	 @Override
	public String toString(){
		return "Home[id="+id+",adresse="+adresse+",superficie"+superficie+",superficie"+superficie+"]";
	}
	

}
