package com.demo.service;

public class Mailservice implements MessageService {
	
	private String empName;
	private String mail;
	
	
	
	
	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	@Override
	public void sendMessage() {
		System.out.println("Name is:"+empName+" has been send to"+mail);
		
	}
	

}
