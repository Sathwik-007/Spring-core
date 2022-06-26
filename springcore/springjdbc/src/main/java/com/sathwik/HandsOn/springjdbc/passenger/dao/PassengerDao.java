package com.sathwik.HandsOn.springjdbc.passenger.dao;

import java.util.List;

import com.sathwik.HandsOn.springjdbc.passenger.dto.Passenger;

public interface PassengerDao {
	public int create(Passenger passenger);
	public Passenger read(int id);
	public int update(Passenger passenger);
	public int delete(int id);
	public List<Passenger> fetchAll();
}
