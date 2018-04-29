package com.example.client.bean;

import java.io.Serializable;

public class LimitBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer minimum;
	Integer maximum;
	Integer port;
	
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "LimitBean [minimum=" + minimum + ", maximum=" + maximum + ", port=" + port + "]";
	}	
}
