package mutiAutowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MutiAutowiredTest {

	
	@Test
	public void testMutiAutoWired(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		People p=(People) apc.getBean("people");
		p.say();
	}
}
