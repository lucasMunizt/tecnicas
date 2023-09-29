package br.edu.uni7.tecnicas.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class LineItem extends Contract {

	private String comments;
	private Double price;
	
	@OneToOne
	private Magazine magazine;
	
	public LineItem() {
		
	}
	
	public LineItem(String comments, Double price) {
		super();
		this.comments = comments;
		this.price = price;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}
	
	
	
}
