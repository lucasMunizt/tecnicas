package br.edu.uni7.tecnicas.jpa.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Publication {
	@Id
	@GeneratedValue
	private Long id;
	private String tittle;
	private int version;
	private Date publishingDate;
	
//	private Author authors;
	public Publication() {
		
	}
	
	public Publication(Long id, String tittle, int version, Date publishingDate) {
		this.id = id;
		this.tittle = tittle;
		this.version = version;
		this.publishingDate = publishingDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}
	
	
}
