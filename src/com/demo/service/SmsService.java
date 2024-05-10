package com.demo.service;

public class SmsService implements MessageService{
	
	private String Message;
	private long mobile;
	
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public void sendMessage() {
		System.out.println("Message is:"+Message+" has been send to"+mobile);
		
	}
	
	
	
	

}
