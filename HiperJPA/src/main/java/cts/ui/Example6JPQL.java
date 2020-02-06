package cts.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import cts.model.Employee;
import cts.util.JPAUtil;

public class Example6JPQL {
	@SuppressWarnings("unchecked")

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

		Employee emp = em.find(Employee.class, 757);

		if (emp != null) {
			System.out.println(emp);
		}

		String qryString = "Select e from Employee e";
		Query qry = em.createQuery(qryString);

		display(qry.getResultList());
		display(em.createQuery("Select e from Employee WHERE e.basic>10").getResultList());

		List<String> names = em.createQuery("Select e.empname FROM Employee e").getResultList();
		for (String n : names) {
			System.out.println(n);

		}

		em.close();
		JPAUtil.shutdown();

	}

	static void display(List<Employee> data) {
		System.out.println("----");
		for (Employee e : data) {
			System.out.println(e);
		}
		System.out.println("-----");
	}

}
