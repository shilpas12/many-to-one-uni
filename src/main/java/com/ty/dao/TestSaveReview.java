package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Product;
import com.ty.dto.Review;

public class TestSaveReview {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product pro = new Product();
		pro.setName("HeadPhone");
		pro.setBrand("JBL");
		pro.setCost(8999);

		Review rws = new Review();
		rws.setUserName("sam");
		rws.setDescription("Nice");
		rws.setProduct(pro);

		Review rws1 = new Review();
		rws1.setUserName("Tanvi");
		rws1.setDescription("Damaged");
		rws1.setProduct(pro);

		Review rws2 = new Review();
		rws2.setUserName("John");
		rws2.setDescription("Late delivery");
		rws2.setProduct(pro);

		entityTransaction.begin();
		entityManager.persist(rws);
		entityManager.persist(rws1);
		entityManager.persist(rws2);
		entityManager.persist(pro);
		entityTransaction.commit();

		System.out.println("----------DATA SAVED-----------");
	}

}
