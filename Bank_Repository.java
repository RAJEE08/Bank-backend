package com.example.Bank_Management_System;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface Bank_Repository extends JpaRepository<Bank,Integer>,PagingAndSortingRepository<Bank, Integer>{

	@Query("SELECT t FROM Bank t WHERE t.customer_id=:t")
	  public List<Bank> getAllNameUsingJPAQL(@Param("t") int customer_id);
}
