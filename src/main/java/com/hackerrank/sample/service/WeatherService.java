package com.hackerrank.sample.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.hackerrank.sample.dto.WeatherData;

@Service
public class WeatherService {

	List<WeatherData> wds = new ArrayList<>(Arrays.asList(
			new WeatherData(001, LocalDate.parse("16-Aug-2016", DateTimeFormatter.ofPattern("d-MMM-yyyy")), "fname",
					"lname", Long.parseLong("1234567890")),
			new WeatherData(002, LocalDate.parse("16-Aug-2020", DateTimeFormatter.ofPattern("d-MMM-yyyy")), "baba",
					"ramdev", Long.parseLong("1234567890")),
			new WeatherData(003, LocalDate.parse("16-Aug-2021", DateTimeFormatter.ofPattern("d-MMM-yyyy")), "fname",
					"lname", Long.parseLong("1234567890"))));

	public List<WeatherData> getAllWDs() {
		return wds;
	}

	public WeatherData getWD(Integer id) throws NoSuchElementException {
		long count = wds.stream().filter(t -> t.getId().equals(id)).count();
		if (count < 1) {
			return null;
		}
		WeatherData wd = wds.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return wd;
	}

	public void addWD(WeatherData weatherData) {
		this.wds.add(weatherData);
	}

	public int deleteWD(Integer id) {
		if (getWD(id) == null) {
			return 404;
		} else {
			this.wds.removeIf(t -> t.getId().equals(id));
			return 200;
		}
	}

}
