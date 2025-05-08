package com.sb.main.service;

import java.util.List;

import com.sb.main.entity.Passenger;

public interface PassengerService {
	Passenger addPassenger(Passenger pas);
	Passenger passengerDetails(int seatNo);
	List<Passenger> ListOfPassenger();
	Passenger removePassenger(int seatNo);
	Passenger updatePassenger(int seatNo, Passenger pas);
	void deleteAllPassenger();
}
