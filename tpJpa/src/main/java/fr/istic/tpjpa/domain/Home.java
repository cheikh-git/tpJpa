package fr.istic.tpjpa.domain;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Home {
	
	private Long id;
	
	private String adresse;
	private double superficie;
	private String adresse_ip;
	private List<Heater> heaters = new ArrayList<Heater>();
	private Person person;
	
	public Home(){
		
	}
	
	
	public Home(String adresse,double superficie,String adresse_ip){
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
	public String getAdresse_ip() {
		return adresse_ip;
	}
	public void setAdresse_ip(String adresse_ip) {
		this.adresse_ip = adresse_ip;
	}
	@OneToOne
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
