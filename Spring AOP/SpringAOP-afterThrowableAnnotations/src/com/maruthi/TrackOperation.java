package com.maruthi;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation{
	@AfterThrowing(
		      pointcut = "execution(* Operation.*(..))",
		      throwing= "error")
		      
	public void myadvice(JoinPoint jp,Throwable error)//it is advice
	{
		// invoke java mail api / third party gateway to send a mesage to cutomer 
		// store in db in diff table.
		System.out.println("additional concern");
		System.out.println("Method Signature: "  + jp.getSignature());
		System.out.println("Exception is: "+error);
		System.out.println("end of after throwing advice...");
	}
}
