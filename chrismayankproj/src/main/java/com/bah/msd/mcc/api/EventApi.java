package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.domain.Event;
@RestController
@RequestMapping("/events")
public class EventApi {

private ArrayList<Event> eventList = new ArrayList<>();
	
	public EventApi() {
		Event c1 = new Event(100L, "CNF001", "All-Java Conference", "Lectures and exhibits covering all java topics");
		Event c2 = new Event(101L, "CN001", "Rock Concert", "Full blown rock concert");
		this.eventList.add(c1);
	}
	@GetMapping
	public Collection<Event> getAll(){
		return this.eventList;
	}
}
//key  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
