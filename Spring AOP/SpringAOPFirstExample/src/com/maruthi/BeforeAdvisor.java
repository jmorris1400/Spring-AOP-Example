package com.maruthi;

import java.lang.reflect.Method;  

import org.springframework.aop.AfterReturningAdvice;
public class BeforeAdvisor implements AfterReturningAdvice {  
   // @Override  
  //  public void after(Method method, Object[] args, Object target)throws Throwable {
   /* public void after(Method method, Object[] args, Object target)throws Throwable {
        System.out.println("additional concern after actual logic");  
    }*/

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("after retrurning busines logic method.....");
	}

	//@Override
	/*public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
        System.out.println("additional concern before actual logic");  

	} */
}  