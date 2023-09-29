package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Company {
@Id
@GeneratedValue
private Long id;
private String name;
private Double revenue;
@OneToMany(mappedBy = "publisher")
List<Magazine> magazines = new ArrayList<Magazine>();
@OneToMany
List<Subscription> subscription = new ArrayList<Subscription>();

@Embedded
private Address address;

Company(){
	
}


public Company(Long id, String name, Double revenue) {
	super();
	this.id = id;
	this.name = name;
	this.revenue = revenue;
}


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


public Double getRevenue() {
	return revenue;
}


public void setRevenue(Double revenue) {
	this.revenue = revenue;
}


public List<Magazine> getMagazines() {
	return magazines;
}


public void setMagazines(List<Magazine> magazines) {
	this.magazines = magazines;
}


public List<Subscription> getSubscription() {
	return subscription;
}


public void setSubscription(List<Subscription> subscription) {
	this.subscription = subscription;
}



}
