package aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAround {

	@Test
	public void testAround(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		Speech s=(Speech)apc.getBean("speech");
		s.speak("3");
	}
}
