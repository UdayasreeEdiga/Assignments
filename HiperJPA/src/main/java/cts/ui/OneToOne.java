package cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.BankAccount;
import cts.model.Customer;
import cts.util.JPAUtil;

public class OneToOne {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Customer cs=new Customer("987654320","Udayasree",ba);
		ba.setAccno("SBC001");
		ba.setCustomer(cs);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn= em.getTransaction();
		
		txn.begin();
		em.persist(cs);
		txn.commit();
		System.out.println("saved");
		JPAUtil.shutdown();
		
	}

}
