package br.edu.uni7.tecnicas.jpa;

import java.util.GregorianCalendar;
import java.util.List;

import br.edu.uni7.tecnicas.jpa.entity.Author;
import br.edu.uni7.tecnicas.jpa.entity.Subscription;
import br.edu.uni7.tecnicas.jpa.persistence.AuthorRepository;
import br.edu.uni7.tecnicas.jpa.persistence.SubscriptionRepository;

public class Main {

	public static void main(String[] args) {
//		SubscriptionRepository repository = new SubscriptionRepository();
//		
//		Subscription s1 = new Subscription(null, new GregorianCalendar(),10.0);
				
		//s1 = repository.create(s1);
		
//		System.out.println(s1.getId());
//		Subscription s2 = repository.findById(1L);
//		
//		if(s2 != null) {
//			System.out.println("Achou: com valor"+ s2.getPayment());
//		}else {
//			System.out.println("nao deu certo");
//		}
//		
		
//		List<Subscription> subscriptions  = repository.findAll();
//		
//		for(Subscription s : subscriptions) {
//			System.out.println(s.getPayment());
//		
//		
//			if(s.getId() % 2 !=0) {
//				s = repository.delete(s.getId());
//				System.err.println("removido: "+ s.getId());
//			}else {
//				s.setPayment(s.getPayment() * 1.1);
//				repository.(s);
//			}
		
//			
//			
//		}
		AuthorRepository authorRepository = new AuthorRepository();
		Author s2 = new Author(null,"lucas","muniz");
		Author s3 = new Author(null,"pedro","brito");
			//s3 = authorRepository.create(s3);
			//s3 = authorRepository.findById(2L);
			//System.out.println(s3.getFirstName());
	
			List<Author> authors = authorRepository.findAll();
			for(Author a : authors ) {
				System.out.println(a.getFirstName());
			}
	}
	
	
}
