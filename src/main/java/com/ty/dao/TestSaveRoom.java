package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Hotel;
import com.ty.dto.Room;

public class TestSaveRoom {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hotel hotel = new Hotel();
		hotel.setName("Taj");
		hotel.setAddress("Banglore");

		Room room = new Room();
		room.setType("1 sharing");
		room.setCapacity(2);
		room.setHotel(hotel);

//		Room room1 = new Room();
//		room1.setType("4 sharing");
//		room1.setCapacity(5);
//		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setType("2 sharing");
		room2.setCapacity(2);
		room2.setHotel(hotel);

		entityTransaction.begin();
		entityManager.persist(room);
//		entityManager.persist(room1);
		entityManager.persist(room2);
		entityManager.persist(hotel);
		entityTransaction.commit();

		System.out.println("----------DATA SAVED-----------");

	}

}
