package br.edu.uni7.tecnicas.jpa;

import java.util.GregorianCalendar;
import java.util.Properties;

import br.edu.uni7.tecnicas.jpa.entity.Book;
import br.edu.uni7.tecnicas.jpa.entity.User;
import br.edu.uni7.tecnicas.jpa.entity.Vehicle;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseGen {
	public static void main(String[] args) {
		Properties config = new Properties();
		config.put("hibernate.hbm2ddl.auto", "create");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu", config);
		EntityManager em = factory.createEntityManager();


		
//		/*User u1 = em.Find(User.class)
//		 * if(!u1 != null){
//		 * 
//		 * sout(u1.getName)
//		 * }
//		 * u1.getVehicles().size();
//		 * for(Vehicle v: u1.getVehicles()){
//		 * sout(v.getModel());
//		 * }
//		 * 
//		 * */
//		
//		/*User user = new User(null,"vitor","Vitor","123456");
//		Vehicle v1  = new Vehicle(null,"camaro","gm","abc-123");
//		Vehicle v2  = new Vehicle(null,"celta","gm","abc-156");*/
//		User user = new User(null,"Vitor","vitor@gmail.com","123456");
//		User u2 = new User(null,"lucas","lucas@gmail.com","123456");
//		User u3 = new User(null,"Andre","andre@gmail.com","123456");
//		
//		Book book = new Book(null,"java como progamar","livro Bom Java","123456898",new GregorianCalendar());
//		Book b2 = new Book(null,"Estrutura de Dados","Livro bom de ED","127654758",new GregorianCalendar());
//		Book b3 = new Book(null,"Sistema Distribuidos","Livro bom de SD","12365340",new GregorianCalendar());
//		
//		u2.getbooks().add(book);
//		book.getAuthors().add(u2);
//		user.getbooks().add(b2);
//		b2.getAuthors().add(user);
//		
//		u2.getbooks().add(b2);
//		b2.getAuthors().add(u2);
//		u2.getbooks().add(b3);
//		b3.getAuthors().add(u2);
//		
//		u3.getbooks().add(book);
//		book.getAuthors().add(u3);
//		u3.getbooks().add(b2);
//		b2.getAuthors().add(u3);
//		u3.getbooks().add(b3);
//		b3.getAuthors().add(u3);
//		
		
		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		factory.close();
	}
}
