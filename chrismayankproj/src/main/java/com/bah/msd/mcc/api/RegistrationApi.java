package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.domain.Registration;

@RestController
@RequestMapping("/registrations")
public class RegistrationApi {

private ArrayList<Registration> registrationList = new ArrayList<>();
	
	public RegistrationApi() {
		Registration c1 = new Registration(1L, 2L, 3L, "password", "chris@bah.com");
		this.registrationList.add(c1);
	}
	@GetMapping
	public Collection<Registration> getAll(){
		return this.registrationList;
	}
}

