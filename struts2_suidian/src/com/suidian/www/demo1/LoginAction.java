package com.suidian.www.demo1;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action{

	private String username;
	private String userpwd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	public String execute() throws Exception{
		if(getUsername().equals("ubuntu")&&getUserpwd().equals("root")) {
//			通过ActionContext对象访问web应用的HTTP Session
			ActionContext.getContext().getSession().put("user", username);
			return "success";
		}else {
			return "error";
		}
	}
}
