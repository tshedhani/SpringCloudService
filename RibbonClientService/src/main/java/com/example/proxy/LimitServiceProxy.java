package com.example.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ConfigClientService", configuration = com.example.config.FeignClientConfiguration.class)
@RibbonClient(name = "ConfigClientService")
public interface LimitServiceProxy {

	@GetMapping("/getLimits")
	public String getLimit();
	
	@RequestMapping(value = "/getLimits",
            method = RequestMethod.GET,
            produces = {
                    MediaType.TEXT_HTML_VALUE
            })
    ResponseEntity<String> getAccount();
}
