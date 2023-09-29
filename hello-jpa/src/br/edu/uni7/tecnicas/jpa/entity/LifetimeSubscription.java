package br.edu.uni7.tecnicas.jpa.entity;

import jakarta.persistence.Entity;

@Entity
public class LifetimeSubscription extends Subscription {
	private Boolean eliteClub;


	public Boolean getEliteClub() {
		return eliteClub;
	}

	public void setEliteClub(Boolean eliteClub) {
		this.eliteClub = eliteClub;
	}
	
	
	
}
