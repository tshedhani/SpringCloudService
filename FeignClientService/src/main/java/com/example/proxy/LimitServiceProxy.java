package com.example.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ConfigClientService", url = "http://localhost:8090", configuration = com.example.config.FeignClientConfiguration.class) 
public interface LimitServiceProxy {

//	@GetMapping("/version/getName/{firstName}/{lastName}")
//	public Object getName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName);
	
	@GetMapping("/getLimits")
	public String getLimit();
	
	@RequestMapping(value = "/getLimits",
            method = RequestMethod.GET,
            produces = {
                    MediaType.TEXT_HTML_VALUE
            })
    ResponseEntity<String> getAccount();
}
