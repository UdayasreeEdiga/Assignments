package cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.Course;
import cts.model.Trainee;
import cts.util.JPAUtil;

public class Example5 {
	public static void main(String[] args ) {
		Course mca= new Course(101,"MCA", new TreeSet<Trainee>());
		Course mba= new Course(102,"MBA", new TreeSet<Trainee>());
		
		mca.getTrainees().add(new Trainee(201, "us", mca));
		mca.getTrainees().add(new Trainee(202, "eus", mca));
		mca.getTrainees().add(new Trainee(203, "sree", mca));
		
		mba.getTrainees().add(new Trainee(204, "uday", mba));
		mba.getTrainees().add(new Trainee(205,"harshi",mba));
		mba.getTrainees().add(new Trainee(206,"nithish",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
		
		System.out.println("Saved");
		JPAUtil.shutdown();
	}

}
