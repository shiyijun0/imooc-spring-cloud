package com.lilin.controller;

import com.lilin.service.CityClient;
import com.lilin.service.ReportClient;
import com.lilin.service.ZuulReportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * City Controller.
 * 
 * @since 1.0.0 2017年11月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/report")
public class ReportController {
	@Autowired
	private ReportClient reportClient;
	@GetMapping("/cityId/{cityId}")
	@ResponseBody
	public String listCity(@PathVariable("cityId") String cityId) {
		// 通过Feign客户端来查找
		String body = reportClient.listCity(cityId);
		return body;
	}

	@GetMapping("/{cityId}")
	@ResponseBody
	public String listCity1(@PathVariable("cityId") String cityId) {
		// 通过Feign客户端来查找

		String body = "7889";
		try {
			body = reportClient.listCity1(cityId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return body;
	}


}
