package com.hackerrank.sample.service;

import org.springframework.stereotype.Service;

import com.hackerrank.sample.dto.StringResponse;

@Service
public class HelloService {

	StringResponse sr = new StringResponse("Default Hello World!");

	public StringResponse getSr() {
		return sr;
	}

	public void setSr(StringResponse sr) {
		//sr.setEcho(echo);
		this.sr = sr;
	}
	
	
}
