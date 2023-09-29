package br.edu.uni7.tecnicas.jpa.persistence;

import java.util.List;

import br.edu.uni7.tecnicas.jpa.entity.Subscription;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SubscriptionRepository {
	private EntityManagerFactory factory;
	
	
	public SubscriptionRepository() {
	 factory = Persistence.createEntityManagerFactory("uni7-pu");
	}
	
	public Subscription create(Subscription subscripion) {
		EntityManager em = factory.createEntityManager();
		

		em.getTransaction().begin();
		
		em.persist(subscripion);
		
		
		em.getTransaction().commit();
		
		em.close();
		
		return subscripion;
		
	}
	
	public Subscription findById(Long id) {
		EntityManager em = factory.createEntityManager();
		
		Subscription subscription = em.find(Subscription.class, id);
		
		return subscription;
		
		
	}
	
	public List<Subscription> findAll(){
		EntityManager em = factory.createEntityManager();
		
		TypedQuery<Subscription> query = em.createQuery("select s from Subscription s",Subscription.class);
		
		List<Subscription> subscriptions = query.getResultList();
		
		return subscriptions;
	}
	
	public Subscription delete(Long id) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Subscription subscription = em.find(Subscription.class, id);
		
		if(subscription !=null) {
			em.remove(subscription);
			
		}
		
		em.getTransaction().commit();
	
		return subscription;
	}
		
	public List<Subscription> findByPaymentLowerThan(Double payment){
		EntityManager em = factory.createEntityManager();
		
		TypedQuery<Subscription> query = em.createQuery("select s from Subscription s where s.payment <:payment",Subscription.class);
			query.setParameter("payment", payment);
		
		List<Subscription> result = query.getResultList();
		
		
		em.close();
		return result;
	}
	
	
	
	
	
	
		public Subscription update(Subscription subscription) {
			EntityManager em = factory.createEntityManager();
			
			em.getTransaction().begin();
			
			
			Subscription fromDB = em.find(Subscription.class, subscription.getId());
			
			if(fromDB !=null) {
				fromDB.setPayment(subscription.getPayment());
				fromDB.setStartDate(subscription.getStartDate());
				em.merge(fromDB);
				
			}
			
			em.getTransaction().commit();
			
			em.close();
			
			return fromDB;
			
		}
		
	
	
}
