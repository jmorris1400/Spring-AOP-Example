package com.maruthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test{
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation e = (Operation) context.getBean("opBean");
		System.out.println("calling msg...");
		e.msg();
		System.out.println("calling m...");
		e.m();
		System.out.println("calling k...");
		e.k();
	}
}














































































































