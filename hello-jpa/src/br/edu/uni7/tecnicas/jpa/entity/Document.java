package br.edu.uni7.tecnicas.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Document {
	@Id
	@GeneratedValue
	private Long id;

public Document() {
	
}


public Document(Long id) {
	super();
	this.id = id;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}



}
