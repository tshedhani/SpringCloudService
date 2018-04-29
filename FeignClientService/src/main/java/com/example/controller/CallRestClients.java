package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.proxy.LimitServiceProxy;

@RestController
public class CallRestClients {
	
	@Autowired
	LimitServiceProxy limitServiceProxy; 

	@GetMapping("/traditionalRestCall")
	public void callLimitServiceFromConfigClientServiceTraditional() {

		ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http://localhost:8090/getLimits",
				String.class);
		
		String response = responseEntity.getBody();		
		System.out.println(response);
	}
	
	@GetMapping("/FeignRestCall")
	public void callLimitServiceFromConfigClientServiceFeign() {
		
		Object object = null;
		object = limitServiceProxy.getAccount();
		
		System.out.println("From Feign Client : " + object.toString());
	}	
}
