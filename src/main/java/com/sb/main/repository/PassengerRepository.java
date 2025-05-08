package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.main.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{
}
