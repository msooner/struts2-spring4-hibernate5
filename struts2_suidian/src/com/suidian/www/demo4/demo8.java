package com.suidian.www.demo4;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class demo8 extends ActionSupport{

	private Map<String, User> map;
	
	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	@Override
	public String execute() {
		for(String key: map.keySet()) {
			System.out.println(key + "   " + map.get(key));
		}
		
		return NONE;
	}
	
}
