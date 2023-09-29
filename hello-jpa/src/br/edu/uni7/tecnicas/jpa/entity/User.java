package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "nome", nullable = false)
	private String name; 
	
	@Column(name = "usuario", nullable = false)
	private String username;
	
	@Column(name = "senha",nullable = false)
	private String password;
	
	//@OneToMany(mappedBy = "owner",fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	//private List<Venhicle> vehicles = new ArrayList<>();
	//private List<Vehicle> vehicles = new ArrayList<>();
	@ManyToMany
	@JoinTable(name = "USER_BOOK",
		joinColumns =  @JoinColumn(name = "user_id"),
		inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Book> books = new ArrayList<Book>();
	
	public User(){
		
	}

	public User(Integer id, String name, String username, String password) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		vehicle.setOwner(this);
	}*/

	public List<Book> getbooks() {
		return books;
	}

	public void setbooks(List<Book> books) {
		books = books;
	}


	
}
