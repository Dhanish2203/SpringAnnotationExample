package com.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Employee;

public class client {
public static void main (String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee service=(Employee)context.getBean("emp");
		System.out.println("EMP id:"+service.getEmpid());
		service.getMessage().sendMessage();

		
	}

}
