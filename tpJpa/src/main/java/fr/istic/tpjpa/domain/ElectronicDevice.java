package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


//@Entity
public class ElectronicDevice {
	
	private Long id;
	
	private String name;
	private Long capacite;
	
	private Home home;
	
	public ElectronicDevice(){
		
	}
	public ElectronicDevice(Long id,String name,Long capacite,Home home ){
		
		this.id=id;
		this.name=name;
		this.capacite=capacite;
		this.home=home;
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
		public Long getCapacite() {
		return capacite;
	}
		public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}
		
		@Id
		@GeneratedValue	
		public Home getHome() {
		return home;
	}
		public void setHome(Home home) {
		this.home = home;
	}
		
	
	
	

}
