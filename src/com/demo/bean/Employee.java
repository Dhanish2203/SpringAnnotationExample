package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.service.MessageService;

public class Employee {
	
	private int empid;
	private MessageService message;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public MessageService getMessage() {
		return message;
	}
	
	@Autowired
	public void setMessage(MessageService message) {
		this.message = message;
	}
	 
	

}
