package com.lilin.controller;

import com.lilin.service.ReportClient;
import com.lilin.service.ZuulReportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * City Controller.
 * 
 * @since 1.0.0 2017年11月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/api")
public class APIReportController {
	@Autowired
	private ZuulReportClient zuulReportClient;


	@GetMapping("/cityId/{cityId}")
	public String api(@PathVariable("cityId") String cityId) {
		// 通过Feign客户端来查找

		String body = null;
		try {
			body = zuulReportClient.listCity(cityId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return body;
	}
}
