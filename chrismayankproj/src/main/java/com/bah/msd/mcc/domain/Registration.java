package com.bah.msd.mcc.domain;

public class Registration {
	private long id;
	private long event_id;
	private long customer_id;
	private String registration_date;
	private String notes;
	public Registration(long id, long event_id, long customer_id, String registration_date, String notes) {
		super();
		this.id = id;
		this.event_id = event_id;
		this.customer_id = customer_id;
		this.registration_date = registration_date;
		this.notes = notes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(long event_id) {
		this.event_id = event_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getRegistration_date() {
		return registration_date;
	}
	public void setRegistration_date(String reigstration_date) {
		this.registration_date = reigstration_date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	
}
