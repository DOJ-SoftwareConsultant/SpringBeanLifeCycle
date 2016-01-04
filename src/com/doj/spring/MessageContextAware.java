package com.doj.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageContextAware implements ApplicationContextAware{
	
	//we can applicationContextAware any where in our classes just we have to implemnts ApplicationContextAwere interface there
	ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("setApplicationContext is called");
	}
	
	public void display(){
		Message message = (Message) applicationContext.getBean("message");
		message.showMessage();
	}
}
