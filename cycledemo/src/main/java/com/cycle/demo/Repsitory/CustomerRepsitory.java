package com.cycle.demo.Repsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cycle.demo.model.Customer;

public interface CustomerRepsitory extends JpaRepository<Customer,Long>{
	
	@Query(value="SELECT c FROM Customer c join c.address a")
	List<Customer>getCustomer();

}
