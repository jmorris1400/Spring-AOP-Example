package com.maruthi;
public  class Operation{
	public void validate(int age)throws Exception{
	if(age<18){
		throw new ArithmeticException("Not valid age");
	}
	else{
		System.out.println("Thanks for vote");
	}
	}
	public void testme()
	{
		System.out.println("hai");
	}
	
}
