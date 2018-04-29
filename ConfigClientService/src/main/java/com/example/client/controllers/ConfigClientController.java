package com.example.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.bean.LimitBean;

@RestController
public class ConfigClientController {

	@Value("${service.minimum:9}")
	Integer min;

	@Value("${service.maximum:9999}")
	Integer max;

	@Autowired
	Environment environment;

	//@Secured("ROLES_USER")
	@GetMapping("/getLimits")
	public String getLimits() {

		LimitBean bean = new LimitBean();
		bean.setMaximum(max);
		bean.setMinimum(min);
		bean.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return bean.toString();
	}
}
