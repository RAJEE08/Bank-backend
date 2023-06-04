package com.example.Bank_Management_System;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Bank_Controller 
{
@Autowired
		 Bank_Repository BR;
		 BankService BS;
	
@PostMapping("/saveCustomer")
public String create(@RequestBody Bank BR11)
{
	BR.save(BR11);
	return "Your record is saved";
}
@GetMapping("/showDetails")
public List<Bank> Customer_Details()
{
	return BR.findAll();
}
@PutMapping("/update/{id}")

public Bank updateDetails(@RequestBody Bank b)
{
	System.out.println("Successfully Updated");
	return BR.save(b);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable("id") int id)
{
	BR.deleteById(id);
	return "Deleted successfully";
}

@GetMapping(value = "/sortstaff/{field}")
public Iterable<Bank> sorting(@PathVariable ("field") String field) 
{	
	return BS.sorting(field);
}
@GetMapping(value = "/pagingstaff/{pageNo}/{pageSize}")
public Page<Bank> paging(@PathVariable ("pageNo") int pageno,@PathVariable ("pageSize") int pageSize)
{
	return BS.paging(pageno, pageSize);
}
@GetMapping(value = "/pagingsortingstaff/{pageNo}/{pageSize}/{field}")
public Page<Bank> PagingAndSorting(@PathVariable ("pageNo") int pageno,@PathVariable ("pageSize") int pageSize,@PathVariable ("field")String field) 
{
	return BS.pagingandsorting(pageno, pageSize,field);
}
@GetMapping("getcustomerid/{customer_id}")
public List<Bank> getAllNameUsingJPAQL(@PathVariable int customer_id)
{
	return BR.getAllNameUsingJPAQL(customer_id);
}

}