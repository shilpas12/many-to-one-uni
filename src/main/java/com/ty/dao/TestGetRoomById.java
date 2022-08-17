package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Hotel;
import com.ty.dto.Room;

public class TestGetRoomById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Room room = entityManager.find(Room.class, 1);

		Hotel hotel = room.getHotel();
		System.out.println("room id: " + room.getId());
		System.out.println("room type : " + room.getType());
		System.out.println("room capacity : " + room.getCapacity());

		System.out.println("Hotel id: " + hotel.getId());
		System.out.println("Hotel name : " + hotel.getName());
		System.out.println(" Hotel Address: " + hotel.getAddress());
		System.out.println("-----------------------------");
	}

}
