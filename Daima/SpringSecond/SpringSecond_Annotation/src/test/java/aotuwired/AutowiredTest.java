package aotuwired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowired.People;

public class AutowiredTest {

	@Test
	public void testAutowired(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		People p=(People) apc.getBean("people");
		p.speak("welcome to spring");
	}
}
