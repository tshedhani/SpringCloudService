package com.example.client;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class LoggingFilter extends ZuulFilter{


	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		HttpServletRequest request = 
				RequestContext.getCurrentContext().getRequest();
		System.out.println("Request -->" + request);
		System.out.println("RequestURI -->" + request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "pre"; // post, error etc etc..s
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
