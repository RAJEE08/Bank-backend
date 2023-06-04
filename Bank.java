package com.example.Bank_Management_System;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private int account_no;
	private int account_balance;
	private String account_type;
	private Long phone_no;
	private String username;
	private String password;
	
	public Bank()
	{
		
	}
	
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public int getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Bank(int customer_id, String customer_name, int account_no, int account_balance, String account_type,
			Long phone_no, String username, String password) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.account_no = account_no;
		this.account_balance = account_balance;
		this.account_type = account_type;
		this.phone_no = phone_no;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "Bank [customer_id= "+ customer_id +",customer_name= "+ customer_name +",account_no= "+ account_no +",account_balance= "+ account_balance +",account_type= "+ account_type +",phone_no= "+ phone_no +",username= "+ username +",password= "+ password +" ]";
	}
}
