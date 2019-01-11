package com.lilin.service;

import com.lilin.service.fallback.CityClientBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * City Client.
 * 
 * @since 1.0.0 2017年11月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@FeignClient(value = "msa-weather-city-eureka",fallback = CityClientBack.class)
//@Component
public interface CityClient {

	@GetMapping("/cities")
	String listCity();
}
