package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Subscription {
@Id
@GeneratedValue
private Long id;
private Calendar startDate;
private Double payment;

@OneToMany
private List<LineItem> items = new ArrayList<LineItem>();

public Subscription() {
	
}

public Subscription(Long id, Calendar startDate, Double payment) {
	super();
	this.id = id;
	this.startDate = startDate;
	this.payment = payment;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Calendar getStartDate() {
	return startDate;
}

public void setStartDate(Calendar startDate) {
	this.startDate = startDate;
}

public Double getPayment() {
	return payment;
}

public void setPayment(Double payment) {
	this.payment = payment;
}

public List<LineItem> getItems() {
	return items;
}

public void setItems(List<LineItem> items) {
	this.items = items;
}

	
	
}
