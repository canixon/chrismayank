package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerApi {

	private ArrayList<Customer> customerList = new ArrayList<>();
	
	public CustomerApi() {
		Customer c1 = new Customer(1L, "CHris", "password", "chris@bah.com");
		this.customerList.add(c1);
	}
	
	public Collection<Customer> getAll(){
		return this.customerList;
	}
}
