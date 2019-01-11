package com.lilin.controller;

import com.lilin.service.CityClient;
import com.lilin.service.CityClientHytric;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * City Controller.
 * 
 * @since 1.0.0 2017年11月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
public class CityController {
	@Autowired
	private CityClient cityClient;
	@Autowired
	private CityClientHytric cityClientHytric;

	@GetMapping("/city")
	public String City() {
		// 通过Feign客户端来查找
		String body = cityClient.listCity();
		return body;
	}

	@GetMapping("/cities")
	@HystrixCommand(fallbackMethod="defaultCities")
	public String listCity() {
		// 通过Feign客户端来查找
		String body = cityClientHytric.listCity();
		return body;
	}

	public String defaultCities() {
		return "City Data Server is down!";
	}
}
