package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.main.entity.Passinger;

@Repository
public interface PassingerRepository extends JpaRepository<Passinger, Integer>{
}
