package com.hackerrank.sample.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.sample.dto.StringResponse;
import com.hackerrank.sample.service.HelloService;



@RestController
public class HelloController {

	@Autowired
	private HelloService helloSerive;
	
	@GetMapping("/defaultHello")
	@ResponseStatus(HttpStatus.OK )  //200
	public StringResponse getDefaultHello() {
		return  helloSerive.getSr();
	}
	
	@GetMapping("/defaultHello/{message}")
	@ResponseStatus(HttpStatus.OK )  //200
	public StringResponse getDefaultHelloWithMessage(@PathVariable String message) {
		return helloSerive.getSr();
	}
	
	@PostMapping("/customHello")
	@ResponseStatus(HttpStatus.OK )  //200
	public StringResponse postCustomHello(@RequestParam String message, HttpServletResponse response) {
		
//		if(message == null || message =="" ) {
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST); //400
//		}
		if(message.equals(String.valueOf("Custom Hello World!"))) {
			return new StringResponse("Custom Custom Hello World!");
		}else {
			return new StringResponse("Custom ");
		}
	}
	
}
