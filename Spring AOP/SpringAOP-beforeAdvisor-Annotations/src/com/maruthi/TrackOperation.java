package com.maruthi;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void k123(){}//pointcut name 

	/*@Pointcut("execution(* Operation.k*(..))")
	public void k1234(){}//pointcut name
*/
	//@Before("k123()")//applying pointcut on before advice
	@After("k123()")//applying pointcut on after advice
	public void myadvice(JoinPoint jp)//it is advice
	{
		System.out.println("additional concern");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
