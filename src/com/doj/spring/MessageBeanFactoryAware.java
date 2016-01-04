package com.doj.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MessageBeanFactoryAware implements BeanFactoryAware {
	
	private BeanFactory factory;
	
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
		System.out.println("Bean Factory is set.");
	}
	
	public void display(){
		Message message = (Message) factory.getBean("message");
		message.showMessage();
	}

}
