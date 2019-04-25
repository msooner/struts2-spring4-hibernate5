package com.suidian.www.demo3;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class subAction implements Action{

	@Override
	public String execute() throws Exception {
		
		ActionContext context = ActionContext.getContext();
		
		Map<String, Object> map = context.getParameters();
		
		for(String key:map.keySet()) {
			String[] value = (String[])map.get(key);
			System.out.println(key + "  " + Arrays.toString(value));
		}
		
		context.put("reqname", "reqvalue");
		context.getSession().put("sesname", "sessvalue");
		context.getApplication().put("appname", "appvalue");
		
		return SUCCESS;
	}
	
	public String demo1() {
		// 直接获得request对象，通过HttpServletRequest
		HttpServletRequest request = ServletActionContext.getRequest();
		
		Map<String, String[]> map = request.getParameterMap();
		
		for(String key:map.keySet()) {
			System.out.println(key + "   " + Arrays.toString(map.get(key)));
		}
		
		request.setAttribute("reqName", "reqValue");
		request.getSession().setAttribute("sessName", "Sessvalue");
		request.getServletContext().setAttribute("appName", "appValue");
		
		return SUCCESS;
	}
	
}
