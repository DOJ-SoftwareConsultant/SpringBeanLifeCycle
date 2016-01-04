package com.doj.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleDemo {
	
	public static void main(String[] args) {
		//Initiate state 1
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//set property 2 for example we can also listner for event handling or post process things 
		context.registerShutdownHook();
		
		//Bean Name Aware 3 for naming of beans in container
		//Bean Factory Aware 4
		//Application Context Aware 5
		//BeanPostProcessor 6 for Initializing beans
		//Interface InitializingBean 7
		//Custom init method 8
		Message message = (Message) context.getBean("message");
		//BeanPostProcessor 9 for after Initializing beans
		
		//Now bean is ready for use
		message.showMessage();
		
		MessageContextAware messageCA = (MessageContextAware) context.getBean(MessageContextAware.class);
		messageCA.display();
		
		MessageBeanFactoryAware messagBFA = (MessageBeanFactoryAware) context.getBean(MessageBeanFactoryAware.class);
		messagBFA.display();
		
		//Interface DisposableBean is called
		//custom destory
		context.close();
		//Shut down container
		
		
		//In case of bean factory we have registered beanpostprocessor programatically but applicationcontext set automatically
		/*// create BeanFactory
		ConfigurableBeanFactory  factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		// now register some beans
		// now register any needed BeanPostProcessors
		DisplayNameBeanPostProcessor postProcessor = new DisplayNameBeanPostProcessor(); 
		factory.addBeanPostProcessor(postProcessor);
		// now start using the factory
*/
	}
}
