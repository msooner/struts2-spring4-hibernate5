package com.suidian.www.demo2;

import com.opensymphony.xwork2.Action;

public class curdAction implements Action{
	
	public String add() {
		System.out.println("增加执行了。。。");
		return null;
	}
	
	public String update() {
		System.out.println("更新执行了。。。");
		return null;
	}
	
	public String delete() {
		System.out.println("删除执行了。。。");
		return null;
	}
	
	public String find() {
		System.out.println("查询执行了。。。");
		return null;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
