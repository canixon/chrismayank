package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerApi {

	private ArrayList<Customer> customerList = new ArrayList<>();
	
	public CustomerApi() {
		Customer c1 = new Customer(100L, "Brian", "pass", "brian@a.com");
		Customer c2 = new Customer(101L, "Scott", "pass", "scott@a.com");
		Customer c3 = new Customer(102L, "Jeff", "pass", "jeff@a.com");
		this.customerList.add(c1);
	}
	@GetMapping
	public Collection<Customer> getAll(){
		return this.customerList;
	}
}
