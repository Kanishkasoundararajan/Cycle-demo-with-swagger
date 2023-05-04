package com.cycle.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {


	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String Password;
	private String address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address-id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString()
	{
		return String.format("Customer[id=%i,name=%i,email=%i,password=%i,address=%i]",id,name,email,Password,address);
	}
}
