package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jdk.jfr.Name;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String model;
	
	private String manufacturer;
	
	private String plate;
	@OneToOne
	private ParkingSpace parkingspace; 
	
	@ManyToOne
	@JoinColumn(name = "usuario_id",referencedColumnName = "id" )
	private User owner;
	

	public Vehicle() {
		
	}
	
	public Vehicle(Integer id, String model, String manufacturer, String plate) {
		super();
		this.id = id;
		this.model = model;
		this.manufacturer = manufacturer;
		this.plate = plate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String mamfactore) {
		this.manufacturer = mamfactore;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public ParkingSpace getParkingspace() {
		return parkingspace;
	}
	
 

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public void setParkingspace(ParkingSpace parkingspace) {
		this.parkingspace = parkingspace;
	}
	
	
	
}
