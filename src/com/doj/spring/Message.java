package com.doj.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean, BeanNameAware{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() is called.");
		// Tea and Coffee
	}
	
	public void showMessage(){
		System.out.println("Welcome to DOJ classes!!!");
	}
		
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() is called.");
	}
	
	public void myInit() throws Exception {
		System.out.println("myInit() is called.");
	}
	
	public void cleanUp() throws Exception {
		System.out.println("cleanUp() is called.");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is "+beanName);
	}

}
