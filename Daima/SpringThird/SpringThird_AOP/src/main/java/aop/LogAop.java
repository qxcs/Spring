package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

public class LogAop {
	
	public void before(){
		System.out.println("before");
	}

	public Object around(ProceedingJoinPoint pjp,String times){
		
		Object o=null;
		
		System.out.println("before:"+times);
		
		try {
			o = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("after");
		
		return o;
	}
}
