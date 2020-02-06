//package cts.ui;
//
//import javax.persistence.EntityManager;
//
//import cts.model.Address;
//import cts.model.Faculty;
//import cts.util.JPAUtil;
//
//public class CompositionDemo {
//	public static void main(String[] args) {
//		
//		Faculty f= new Faculty("Udayasree", new Address("A201","Meghana PG","Bangalore,karnataka"));
//		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
//		em.persist(f);
////		em.flush();
//		em.getTransaction().begin();
//		em.persist(f);
//		em.getTransaction().commit();
//		
//		System.out.println("Saved");
//		JPAUtil.shutdown();
//		
//		
//	}
//
//}
