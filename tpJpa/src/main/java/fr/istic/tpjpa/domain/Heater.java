package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

//@Entity
public class Heater {
	
		private Long id;
		
		private Home home;
		private double capacite;
		
		public Heater(){
		
		}
		public Heater(Home home,double capacite){
		this.home=home;
		this.capacite=capacite;
		}
		public Long getId() {
		return id;
		}
		public void setId(Long id) {
		this.id = id;
		}
		@ManyToOne
		public Home getHome() {
		return home;
		}
		public void setHome(Home home) {
		this.home = home;
		}
		public double getCapacite() {
		return capacite;
		}
		public void setCapacite(double capacite) {
		this.capacite = capacite;
		}

}
