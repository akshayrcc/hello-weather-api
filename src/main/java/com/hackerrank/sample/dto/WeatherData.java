package com.hackerrank.sample.dto;

import java.math.BigInteger;
import java.time.LocalDate;

public class WeatherData {

	private Integer id;
	private LocalDate date;
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	
	public WeatherData(Integer id, LocalDate date, String firstName, String lastName, Long phoneNumber) {
		super();
		this.id = id;
		this.date = date;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	   
}
