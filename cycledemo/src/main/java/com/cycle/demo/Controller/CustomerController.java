package com.cycle.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cycle.demo.Service.CustomerService;
import com.cycle.demo.model.Customer;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class CustomerController {

	@Autowired
	CustomerService sc;
	
	@GetMapping("/getAllCustomerDetail")
	public List<Customer>fetchAllCustomerDetail()
	{
		return sc.fetchAllCustomerDetail();
	}
	@Tag(name="Post",description="post data")
	@PostMapping("/saveCustomerDetail")
	public Customer saveCustomerDetail(@RequestBody Customer c)
	{
		return sc.saveCustomerDetail(c);
	}
	@Tag(name="Put",description="put data")
	@PutMapping("/updateCustomerDetail/{id}")
	public Customer updateCustomerDetail(@RequestBody Customer c,@PathVariable("id")Long id)
	{
		return sc.updateCustomerDetail(c,id);
	}
	@Tag(name="Delete",description="delete data")
	@DeleteMapping("deleteCustomerDetails/{id}")
	public void deleteCustomerDetail(@PathVariable("id") Long id) 
	{
		sc.deleteCustomerDetail(id);
	}
}
