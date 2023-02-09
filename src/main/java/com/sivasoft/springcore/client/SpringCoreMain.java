package com.sivasoft.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sivasoft.springcore.model.WelcomeBean;

public class SpringCoreMain {

	public static void main(String[] args) {
      
		WelcomeBean wbean1 = new WelcomeBean();
		wbean1.setMessage("Hello World");
		System.out.println(wbean1.welcome());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		WelcomeBean wbean = context.getBean("wBean",WelcomeBean.class);
		System.out.println(wbean.welcome());
	}

}
