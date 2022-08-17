package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Product;
import com.ty.dto.Review;

public class GetReviewById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Review review = entityManager.find(Review.class, 1);

		Product product = review.getProduct();
		System.out.println("Review id: " + review.getId());
		System.out.println("Review UserName : " + review.getUserName());
		System.out.println("Description: " + review.getDescription());

		System.out.println("Product id: " + product.getId());
		System.out.println("Product name : " + product.getName());
		System.out.println(" Product Brand: " + product.getBrand());
		System.out.println(" Product cost: " + product.getCost());
		System.out.println("-----------------------------");
	}

}
