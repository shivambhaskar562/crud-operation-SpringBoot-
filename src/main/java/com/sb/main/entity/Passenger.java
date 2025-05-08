package com.sb.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger {

	@Id
	private int seatNo;
	private String name;
	private String gender;
	private int birthYear;

	public Passenger() {
	}

	public Passenger(int seatNo, String name, String gender, int birthYear) {
		this.seatNo = seatNo;
		this.name = name;
		this.gender = gender;
		this.birthYear = birthYear;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
