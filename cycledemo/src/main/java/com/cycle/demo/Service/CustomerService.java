package com.cycle.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cycle.demo.Repsitory.CustomerRepsitory;
import com.cycle.demo.model.Customer;

@Service
public class CustomerService {
	@Autowired
	
	CustomerRepsitory cd;
	
	public List<Customer>fetchAllCustomerDetail()
	{
		return cd.findAll();
	}
	public Customer saveCustomerDetail(Customer c)
	{
		return cd.save(c);
	}
	public  Customer updateCustomerDetail(Customer c,Long id) {
		Optional<Customer> optional=cd.findById(id);
		Customer obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setPassword(c.getPassword());
			obj.setEmail(c.getEmail());
			obj.setName(c.getName());
			cd.saveAndFlush(c);
		}
		return obj;
	}
	public void deleteCustomerDetail(Long c) 
	{
		cd.deleteById(c);
	}

}
