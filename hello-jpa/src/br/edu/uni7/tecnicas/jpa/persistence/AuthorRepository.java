package br.edu.uni7.tecnicas.jpa.persistence;

import java.util.List;

import br.edu.uni7.tecnicas.jpa.entity.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class AuthorRepository {

	private EntityManagerFactory factory;
	
	public AuthorRepository() {
		 factory = Persistence.createEntityManagerFactory("uni7-pu");
	}
	
	public Author create(Author author) {
		EntityManager le = factory.createEntityManager();
		

		le.getTransaction().begin();
		
		le.persist(author);
		
		
		le.getTransaction().commit();
		
		le.close();
		
		return author;
		
	}
	public Author findById(Long id) {
		EntityManager le = factory.createEntityManager();
		
		Author author = le.find(Author.class,id);
		
		le.close();
		return author;
		
		
	}
	
	
	public List<Author> findAll(){
		EntityManager le = factory.createEntityManager();
		
		TypedQuery<Author> query = le.createQuery("select s from Auhtor a",Author.class);
		
		List<Author> author = query.getResultList();
		le.close();
		return author;
	}
	
	
	public Author update(Author author) {
		EntityManager le = factory.createEntityManager();
		
		le.getTransaction().begin();
		
		
		Author fromDB = le.find(Author.class, author.getId());
		
		if(fromDB !=null) {
			fromDB.setFirstName(fromDB.getFirstName());
			fromDB.setLastName(fromDB.getLastName());
		}
		
		le.getTransaction().commit();
		
		le.close();
		
		return fromDB;
		
	}
	
	public Author delete(Long id) {
		EntityManager le = factory.createEntityManager();
		
		le.getTransaction().begin();
		
		Author author = le.find(Author.class, id);
		
		if(author !=null) {
			le.remove(author);
			
		}
		
		le.getTransaction().commit();
		le.close();
		return author;
	}
	
}
