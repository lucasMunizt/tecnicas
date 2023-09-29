package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Magazine {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private Double price;
	private Integer copiesSold;
	@Column(unique = true)
	private String isbn;
	
	@OneToOne
	private Article coverArticle;
	
	@OneToMany
	private List<Article> articles = new ArrayList<Article>() ;
	
	
	@ManyToOne
	@JoinColumn(name = "publusher_id",referencedColumnName = "id")
	
	private Company publisher;	
	
	Magazine(){
		
	}
	

	public Magazine(Long id, String title, Double price, Integer copiesSold,String isbn) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.copiesSold = copiesSold;
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(Integer copiesSold) {
		this.copiesSold = copiesSold;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Article getCoverArticle() {
		return coverArticle;
	}

	public void setCoverArticle(Article coverArticle) {
		this.coverArticle = coverArticle;
	}


	public Company getPublisher() {
		return publisher;
	}


	public void setPublisher(Company publisher) {
		this.publisher = publisher;
	}
	
	
	
}
