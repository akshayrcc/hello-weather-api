package com.hackerrank.sample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such WeatherData")  // 404
public class WeatherDataNotFoundException extends RuntimeException {

}
