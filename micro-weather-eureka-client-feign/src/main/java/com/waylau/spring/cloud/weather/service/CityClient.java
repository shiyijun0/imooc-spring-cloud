package com.waylau.spring.cloud.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * City Client.
 * 
 * @since 1.0.0 2017年11月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@FeignClient("msa-weather-city-eureka")
@Component
public interface CityClient {

	@GetMapping("/cities")
	String listCity();
}
