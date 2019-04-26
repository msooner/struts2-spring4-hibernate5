package com.xx.www.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xx.www.domain.Customer;
import com.xx.www.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	
	public Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	private CustomerService customerService;
	
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	public String add() {
		System.out.println("web----add方法运行了" + customer);
		customerService.save(customer);
		return SUCCESS;
	}
	
	

}
