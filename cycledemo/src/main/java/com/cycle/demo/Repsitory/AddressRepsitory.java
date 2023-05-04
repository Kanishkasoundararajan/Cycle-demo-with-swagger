package com.cycle.demo.Repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cycle.demo.model.Address;

public interface AddressRepsitory extends JpaRepository<Address,Long>{
	

}
