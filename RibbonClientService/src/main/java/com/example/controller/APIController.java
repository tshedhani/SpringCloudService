package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proxy.LimitServiceProxy;

@RestController
public class APIController {

	@Autowired
	LimitServiceProxy limitServiceProxy;
	
	@GetMapping("/RibbonRestCall")
	public void callLimitServiceFromConfigClientServiceFeign() {
		
		Object object = null;
		object = limitServiceProxy.getAccount();
		
		System.out.println("From Ribbon Client : " + object.toString());
	}	
}
