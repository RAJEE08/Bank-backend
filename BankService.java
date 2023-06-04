package com.example.Bank_Management_System;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class BankService {
@Autowired

	Bank_Repository BR;

	public List<Bank> getDetails()
	{
		return BR.findAll();
	}
	public String deleteDetails(int id)
	{
		BR.deleteById(id);
		return "Id : "+id+" is deleted";
	}
	public Bank postDetails(Bank z)
	{
		return BR.save(z);
	}
	public Bank updateStaffDetails(Bank x)
	{
		return BR.save(x);
	}
	public Iterable<Bank> sorting(String field) {
		return BR.findAll(Sort.by(field));
	}
	public Page<Bank> paging(int page,int pageSize) {
		Pageable paging=PageRequest.of(page,pageSize);
		return BR.findAll(paging);
	}
	public Page<Bank> pagingandsorting(int offset,int pageSize,String field) {
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		return BR.findAll(paging);
	}
	public List<Bank> getAllNameUsingJPAQL(int customer_id)
	{
		return BR.getAllNameUsingJPAQL(customer_id);
	}
}