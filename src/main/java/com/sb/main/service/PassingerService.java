package com.sb.main.service;

import java.util.List;

import com.sb.main.entity.Passinger;

public interface PassingerService {
	Passinger addPassinfer(Passinger pas);
	Passinger passingerDetails(int seatNo);
	List<Passinger> ListOfPassinger();
	Passinger removePassinger(int seatNo);
	Passinger updatePassinger(int seatNo);
	void deleteAllPassinger();
}
