package com.waylau.spring.cloud.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;


//import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	@LoadBalanced//此注解必须存在  保持负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	private  RestTemplate restTemplate;

	//serviceId获取service
	private static final String  SERVICE_ID = "consulservice3";

	@RequestMapping("/say")
	public String sayService() {
		//使用restTemplate作为模版，serviceId会被ribbonClient替换为服务的地址
		return restTemplate.getForObject("http://"+SERVICE_ID+"/say",String.class);
	}*/

}
