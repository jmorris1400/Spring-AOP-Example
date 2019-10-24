package com.maruthi;

public class Client1 {
	  public static void main(String rags[]) throws Exception  {
	    BeanFactory f=new FileSystemXmlApplicationContext("applicationContext.xml");

	    A aProxy=(A)f.getBean("aProxy");
	    aProxy.a();
	    aProxy.b();
	    aProxy.c();
	    aProxy.d();
	  }
	}
