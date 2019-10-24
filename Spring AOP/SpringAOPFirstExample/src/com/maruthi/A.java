package com.maruthi;

public class A {  
public int m(){System.out.println("actual business logic");
//afterReturning()
return 1;}  
public void test()
{
	System.out.println("hello..");
	//afterReturning()
	return;
}
} 