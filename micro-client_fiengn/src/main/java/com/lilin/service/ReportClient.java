package com.lilin.service;

import com.lilin.service.fallback.ReportClientBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * City Client.
 * 
 * @since 1.0.0 2017年11月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@FeignClient(value ="msa-weather-report-eureka",fallback = ReportClientBack.class)
//@Component
public interface ReportClient {

	@GetMapping("/report/cityId/{cityId}")
	String listCity(@PathVariable("cityId") String cityId);

	@GetMapping("/report/{cityId}")
	String listCity1(@PathVariable("cityId") String cityId) throws Exception;
}
