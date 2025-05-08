package com.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.main.entity.Passenger;
import com.sb.main.repository.PassengerRepository;

@Service
public class PassengerRepoImplementation implements PassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;

	@Override
	public Passenger addPassenger(Passenger pas) {
		return passengerRepository.save(pas);
	}

	@Override
	public Passenger passengerDetails(int seatNo) {
		return passengerRepository.findById(seatNo).get();
	}

	@Override
	public Passenger removePassenger(int seatNo) {
		Passenger pas = passengerRepository.findById(seatNo).get();
		passengerRepository.deleteById(seatNo);
		return pas;
	}

	@Override
	public Passenger updatePassenger(int seatNo, Passenger pas) {
		Passenger oldPas = passengerRepository.findById(seatNo).get();
		pas.setSeatNo(seatNo);
		return passengerRepository.save(pas);
	}

	@Override
	public List<Passenger> ListOfPassenger() {
		return passengerRepository.findAll();
	}

	@Override
	public void deleteAllPassenger() {
		passengerRepository.deleteAll();
	}
	
	

}
