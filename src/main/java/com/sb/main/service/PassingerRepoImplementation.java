package com.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.main.entity.Passinger;
import com.sb.main.repository.PassingerRepository;

@Service
public class PassingerRepoImplementation implements PassingerService{
	
	@Autowired
	PassingerRepository passingerRepository;

	@Override
	public Passinger addPassinfer(Passinger pas) {
		return null;
	}

	@Override
	public Passinger passingerDetails(int seatNo) {
		return null;
	}

	@Override
	public Passinger removePassinger(int seatNo) {
		return null;
	}

	@Override
	public Passinger updatePassinger(int seatNo) {
		return null;
	}

	@Override
	public List<Passinger> ListOfPassinger() {
		return null;
	}

	@Override
	public void deleteAllPassinger() {
		
	}
	
	

}
